public class Kuda extends Hewan {
    String warna;

    public Kuda(String nama, int umur, String warna) {
        super(nama, umur);
        this.warna = warna;
    }

    public void berlari() {
        System.out.println(nama + " berlari dengan cepat!");
    }

    public void mendengus() {
        System.out.println(nama + " bersuara: Ngeng ngeng!");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Warna: " + warna);
    }
}
