package ab.objektorientierte_programmierung.trainingslager.inventar;

abstract class Moebelstueck {

    private final int inventoryNumber;
    private String name;
    private String description;
    private String material;
    private double weightInKilograms;

    public Moebelstueck(int inventoryNumber, String name) {
        this.inventoryNumber = inventoryNumber;
        this.name = name;
    }

    public int getInventoryNumber() {
        return inventoryNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getWeightInKilograms() {
        return weightInKilograms;
    }

    public void setWeightInKilograms(double weightInKilograms) {
        this.weightInKilograms = weightInKilograms;
    }

    @Override
    public String toString() {
        return "Moebelstueck:\n" +
                "Inventory number: " + this.inventoryNumber + "\n" +
                "Name: " + this.name + "\n" +
                "Description: " + this.description + "\n" +
                "Material: " + this.material + "\n" +
                "Weight in kilograms: " + this.weightInKilograms + "\n";
    }
}
