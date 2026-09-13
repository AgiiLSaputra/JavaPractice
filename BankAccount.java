public class BankAccount {
    // Field private — data disembunyikan, tidak bisa diakses langsung dari luar class
    // Ini inti dari encapsulation: data hiding
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = (initialBalance >= 0) ? initialBalance : 0;
    }

    // Getter — cara terkontrol untuk MEMBACA data dari luar / kalau mau liat saldo
    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    // Method public untuk MENGUBAH data, tapi lewat validasi dulu untuk menambah saldo
    // Ini bedanya encapsulation dengan sekadar field public biasa
    public void deposit(double amount) {
        if (!isValidAmount(amount)) {
            System.out.println("Gagal: jumlah deposit harus lebih dari 0");
            return;
        }
        balance += amount;
        System.out.println("Deposit berhasil. Saldo sekarang: " + balance);
    }

    // Method withdraw() mengecek dulu apakah amount > balance sebelum ngurangin saldo. 
    // Aturan ini tidak mungkin dilewati dari luar, karena satu-satunya jalan mengubah 
    // saldo memang cuma lewat method itu.
    // withdraw() itu method untuk menarik/mengurangi saldo — istilah bank-nya "penarikan tunai".
    public boolean withdraw(double amount) {
        if (!isValidAmount(amount)) {
            System.out.println("Gagal: jumlah penarikan harus lebih dari 0");
            return false;
        }
        if (amount > balance) {
            System.out.println("Gagal: saldo tidak mencukupi");
            return false;
        }
        balance -= amount;
        System.out.println("Penarikan berhasil. Saldo sekarang: " + balance);
        return true;
    }

    // Method private — logic internal, cuma dipakai di dalam class ini sendiri
    private boolean isValidAmount(double amount) {
        return amount > 0;
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount rekening = new BankAccount("BR-001", "AgiiL", 500000);

        rekening.deposit(200000);
        rekening.withdraw(100000);
        rekening.withdraw(999999); // akan gagal, saldo tidak cukup

        // rekening.balance = 999999999;
        // ^ INI AKAN ERROR saat compile, karena "balance" bersifat private.
        // Satu-satunya cara mengubah saldo adalah lewat deposit()/withdraw()
        // yang sudah punya validasi di dalamnya.

        System.out.println("Saldo akhir " + rekening.getOwnerName() + ": " + rekening.getBalance());
    }
}