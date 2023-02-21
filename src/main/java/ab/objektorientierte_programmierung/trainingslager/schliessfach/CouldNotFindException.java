package ab.objektorientierte_programmierung.trainingslager.schliessfach;

class CouldNotFindException extends Exception {

    private final String name;
    private final String id;

    public CouldNotFindException(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String getMessage() {
        return "Could not find " + this.name + " with id \"" + this.id + "\"";
    }
}
