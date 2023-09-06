package lf_05.ab.strukturierte_programmierung.refactoring.schritt5;

class Gegenstand {

    private final String NAME;
    private final String BESCHREIBUNG;
    private final double GEWICHT;

    public Gegenstand(String NAME, String BESCHREIBUNG, double GEWICHT) {
        this.NAME = NAME;
        this.BESCHREIBUNG = BESCHREIBUNG;
        this.GEWICHT = GEWICHT;
    }

    public String getNAME() {
        return NAME;
    }

    public String getBESCHREIBUNG() {
        return BESCHREIBUNG;
    }

    public double getGEWICHT() {
        return GEWICHT;
    }

    public String getInfo() {
        return "Name: " + this.NAME + "\n" +
                "Beschreibung: " + this.BESCHREIBUNG + "\n" +
                "Gewicht (kg): " + this.GEWICHT;
    }
}
