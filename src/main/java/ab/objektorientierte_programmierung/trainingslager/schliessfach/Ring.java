package ab.objektorientierte_programmierung.trainingslager.schliessfach;

class Ring extends Schmuckstueck {

    private int sizeInCentimeters;

    public Ring(String id, double valueInUSD, String description, int sizeInCentimeters) {
        super(id, valueInUSD, description);
        this.sizeInCentimeters = sizeInCentimeters;
    }

    public int getSizeInCentimeters() {
        return sizeInCentimeters;
    }

    public void setSizeInCentimeters(int sizeInCentimeters) {
        this.sizeInCentimeters = sizeInCentimeters;
    }

    @Override
    public String toString() {
        return "Ring:\n" +
                super.toString() +
                "Size in cm: " + sizeInCentimeters;
    }
}
