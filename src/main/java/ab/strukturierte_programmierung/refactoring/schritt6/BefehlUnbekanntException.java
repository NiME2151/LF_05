package ab.strukturierte_programmierung.refactoring.schritt6;

class BefehlUnbekanntException extends Exception {

    private String message;

    public BefehlUnbekanntException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
