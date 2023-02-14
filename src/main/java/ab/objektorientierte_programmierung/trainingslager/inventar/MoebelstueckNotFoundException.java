package ab.objektorientierte_programmierung.trainingslager.inventar;

class MoebelstueckNotFoundException extends Exception {

    private final int inventoryNumber;

    public MoebelstueckNotFoundException(int inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    @Override
    public String getMessage() {
        return "The Moebelstueck with inventory number \"" + this.inventoryNumber + "\" could not be found.";
    }
}
