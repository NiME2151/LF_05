package ab.objektorientierte_programmierung.trainingslager.inventar;

import java.util.ArrayList;

class Raum {

    private ArrayList<Moebelstueck> listOfMoebelstuecke = new ArrayList<>();
    private Techniker technician;
    private final int roomNumber;

    public Raum(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Techniker getTechnician() {
        return technician;
    }

    public void setTechnician(Techniker technician) {
        this.technician = technician;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void addMoebelstueck(Moebelstueck furniture) {
        this.listOfMoebelstuecke.add(furniture);
    }

    public Moebelstueck getMoebelstueck(int inventoryNumber) throws MoebelstueckNotFoundException {
        return this.listOfMoebelstuecke.stream()
                .filter(moebelstueck -> moebelstueck.getInventoryNumber() == inventoryNumber)
                .findFirst()
                .orElseThrow(() -> new MoebelstueckNotFoundException(inventoryNumber));
    }

    public void removeMoebelstueck(Moebelstueck moebelstueck) throws MoebelstueckNotFoundException {
        if (this.listOfMoebelstuecke.contains(moebelstueck)) {
            this.listOfMoebelstuecke.remove(moebelstueck);
        }
        else {
            throw new MoebelstueckNotFoundException(moebelstueck.getInventoryNumber());
        }
    }

    public int getMoebelstueckCount() {
        return this.listOfMoebelstuecke.size();
    }

    public double getTotalWeightInKilogramsOfMoebelstueckeInRoom() {
        double totalWeight = 0.0;
        for (Moebelstueck moebelstueck : this.listOfMoebelstuecke) {
            totalWeight += moebelstueck.getWeightInKilograms();
        }
        return totalWeight;
    }

    private String getAllMoebelstuecke() {
        StringBuilder moebelstuecke = new StringBuilder();
        for (Moebelstueck moebelstueck : this.listOfMoebelstuecke) {
            moebelstuecke.append(moebelstueck).append("\n");
        }
        return moebelstuecke.toString();
    }

    @Override
    public String toString() {
        return "Raum:\n" +
                "Room number: " + this.roomNumber + "\n" +
                "Technician: " + this.technician + "\n" +
                "Moebelstuecke count: " + this.getMoebelstueckCount() + "\n" +
                "Total weight of all Moebelstuecke: " + this.getTotalWeightInKilogramsOfMoebelstueckeInRoom() + "\n" +
                "Moebelstuecke in room: " + getAllMoebelstuecke() + "\n";
    }
}
