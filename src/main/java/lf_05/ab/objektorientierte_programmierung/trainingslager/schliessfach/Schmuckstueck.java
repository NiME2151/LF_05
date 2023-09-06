package lf_05.ab.objektorientierte_programmierung.trainingslager.schliessfach;

abstract class Schmuckstueck extends Gegenstand {

    private double value;
    private String description;

    public Schmuckstueck(String id, double value, String description) {
        super(id);
        this.value = value;
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Value: " + value + "\n" +
                "Description: " + description + "\n";
    }
}
