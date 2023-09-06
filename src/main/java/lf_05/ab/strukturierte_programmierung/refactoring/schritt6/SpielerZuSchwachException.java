package lf_05.ab.strukturierte_programmierung.refactoring.schritt6;

class SpielerZuSchwachException extends Exception {

    private Spieler spieler;

    public SpielerZuSchwachException(Spieler spieler) {
        this.spieler = spieler;
    }

    @Override
    public String getMessage() {
        return "Der Spieler " + spieler + " ist zu schwach, um den Bereich zu wechseln.";
    }
}
