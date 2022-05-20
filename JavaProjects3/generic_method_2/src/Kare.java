public class Kare extends Sekil{

    private double kenar;

    public Kare() {
        this.kenar=0;
    }

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public double alanBul() {
        return kenar * kenar;
    }
}
