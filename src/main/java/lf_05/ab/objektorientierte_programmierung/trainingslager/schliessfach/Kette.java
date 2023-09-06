package lf_05.ab.objektorientierte_programmierung.trainingslager.schliessfach;

class Kette extends Schmuckstueck {

    private int lengthInCentimeters;

    public Kette(String id, double valueInUSD, String description, int lengthInCentimeters) {
        super(id, valueInUSD, description);
        this.lengthInCentimeters = lengthInCentimeters;
    }

    public int getLengthInCentimeters() {
        return lengthInCentimeters;
    }

    public void setLengthInCentimeters(int lengthInCentimeters) {
        this.lengthInCentimeters = lengthInCentimeters;
    }

    @Override
    public String toString() {
        return "Kette:\n" +
                super.toString() +
                "Length in cm: " + lengthInCentimeters;
    }
}
