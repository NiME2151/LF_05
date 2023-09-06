package lf_05.ab.strukturierte_programmierung.refactoring.schritt3;

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
