package lf_05.ab.objektorientierte_programmierung.trainingslager.rollenspiel;

class TooExhaustedException extends Exception {

    private final String action;
    private final String name;

    public TooExhaustedException(String action, String name) {
        this.action = action;
        this.name = name;
    }

    @Override
    public String getMessage() {
        return this.name + " cannot " + this.action + ", they are too exhausted.";
    }
}
