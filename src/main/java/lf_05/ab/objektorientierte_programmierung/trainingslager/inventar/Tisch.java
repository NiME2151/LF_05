package lf_05.ab.objektorientierte_programmierung.trainingslager.inventar;

class Tisch extends Moebelstueck {

    private int heightInCentimeters;
    private int lengthInCentimeters;
    private int widthInCentimeters;

    Tisch(int inventoryNumber, String name) {
        super(inventoryNumber, name);
    }

    public int getTabletopSizeInSquareCentimeters() {
        return this.lengthInCentimeters * this.widthInCentimeters;
    }

    public int getHeightInCentimeters() {
        return heightInCentimeters;
    }

    public void setHeightInCentimeters(int heightInCentimeters) {
        this.heightInCentimeters = heightInCentimeters;
    }

    public int getLengthInCentimeters() {
        return lengthInCentimeters;
    }

    public void setLengthInCentimeters(int lengthInCentimeters) {
        this.lengthInCentimeters = lengthInCentimeters;
    }

    public int getWidthInCentimeters() {
        return widthInCentimeters;
    }

    public void setWidthInCentimeters(int widthInCentimeters) {
        this.widthInCentimeters = widthInCentimeters;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Height in cm: " + this.heightInCentimeters + "\n" +
                "Length in cm: " + this.lengthInCentimeters + "\n" +
                "Width in cm: " + this.widthInCentimeters + "\n" +
                "Tabletop area in square cm: " + this.getTabletopSizeInSquareCentimeters() + "\n";
    }
}
