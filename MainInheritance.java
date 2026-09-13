public class MainInheritance {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Kitty", 3, "Putih");
        Kuda kuda = new Kuda("Thunder", 4, "Cokelat");

        System.out.println("=== KUCING ===");
        kucing.info();
        kucing.makan();
        kucing.mengeong();
        kucing.cakar();

        System.out.println();

        System.out.println("=== KUDA ===");
        kuda.info();
        kuda.tidur();
        kuda.mendengus();
        kuda.berlari();

        System.out.println();

        // Polymorphism: parent type menampung child object
        System.out.println("=== POLYMORPHISM ===");
        Hewan hewan1 = kucing;
        Hewan hewan2 = kuda;
        hewan1.makan();
        hewan2.makan();
    }
}
