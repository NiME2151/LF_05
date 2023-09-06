package lf_05.ab.strukturierte_programmierung.chain_of_responsibility_pattern;

abstract class Geld {

    private double wert;

    public Geld(double wert) {
        this.wert = wert;
    }

    public double getWert() {
        return wert;
    }

    @Override
    public String toString() {
        return "Geldwert: " + this.wert;
    }
}
