package ab.objektorientierte_programmierung.trainingslager.inventar;

class Stuhl extends Moebelstueck {

    private int seatHeightInCentimeters;

    Stuhl(int inventoryNumber, String name) {
        super(inventoryNumber, name);
    }

    public int getSeatHeightInCentimeters() {
        return seatHeightInCentimeters;
    }

    public void setSeatHeightInCentimeters(int seatHeightInCentimeters) {
        this.seatHeightInCentimeters = seatHeightInCentimeters;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Seat height in cm: " + this.seatHeightInCentimeters + "\n";
    }
}
