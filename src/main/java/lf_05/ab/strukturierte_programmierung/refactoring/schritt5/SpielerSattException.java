package lf_05.ab.strukturierte_programmierung.refactoring.schritt5;

class SpielerSattException extends Exception {

    private Spieler spieler;

    public SpielerSattException(Spieler spieler) {
        this.spieler = spieler;
    }

    @Override
    public String getMessage() {
        return "Der Spieler " + spieler + " ist bereichts gesättigt.";
    }
}
