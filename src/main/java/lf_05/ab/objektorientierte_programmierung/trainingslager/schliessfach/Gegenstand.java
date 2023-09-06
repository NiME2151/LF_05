package lf_05.ab.objektorientierte_programmierung.trainingslager.schliessfach;

abstract class Gegenstand {

    private final String id;

    public Gegenstand(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n";
    }
}
