package lf_05.ab.strukturierte_programmierung.refactoring.schritt6;

class GegenstandZuSchwerException extends Exception {

    private String nameGegenstand;

    public GegenstandZuSchwerException(String nameGegenstand) {
        this.nameGegenstand = nameGegenstand;
    }

    @Override
    public String getMessage() {
        return "Der Gegenstand " + this.nameGegenstand + " konnte nicht aufgenommen werden, da er zu schwer ist.";
    }
}
