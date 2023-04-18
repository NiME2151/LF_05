package ab.strukturierte_programmierung.refactoring.schritt5;

class Nahrung extends Gegenstand {

    private final int NAEHRWERT;

    public Nahrung(String name, String beschreibung, int NAEHRWERT) {
        super(name, beschreibung, 0);
        this.NAEHRWERT = NAEHRWERT;
    }

    public int getNAEHRWERT() {
        return NAEHRWERT;
    }


}
