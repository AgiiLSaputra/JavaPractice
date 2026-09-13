public class Main {
    public static void main(String[] args) {
        Mobil carku = new Mobil();

        carku.merek = "Nissan";
        carku.nomorMesin = 2208;
        carku.warna = "Blue";
        carku.kecepatan = 340;

        System.out.println("Merek Mobil Ku adalah: " + carku.merek);
        System.out.println("nomor mersin mobil ku: " + carku.nomorMesin);
        System.out.println("Warn Mobil ku: " + carku.warna);
        System.out.println("Kecepatan: " + carku.kecepatan);
    }
}