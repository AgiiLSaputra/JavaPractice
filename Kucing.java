public class Kucing extends Hewan {
    String warnaBulu;

    public Kucing(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }

    public void mengeong() {
        System.out.println(nama + " berkata: Meong!");
    }

    public void cakar() {
        System.out.println(nama + " mencakar!");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Warna bulu: " + warnaBulu);
    }
}
