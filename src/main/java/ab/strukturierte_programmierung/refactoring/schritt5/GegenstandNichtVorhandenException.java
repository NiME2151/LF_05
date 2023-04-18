package ab.strukturierte_programmierung.refactoring.schritt5;

class GegenstandNichtVorhandenException extends Exception {

    private String message;

    public GegenstandNichtVorhandenException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
