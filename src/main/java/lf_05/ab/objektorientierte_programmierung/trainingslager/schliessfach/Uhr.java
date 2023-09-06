package lf_05.ab.objektorientierte_programmierung.trainingslager.schliessfach;

class Uhr extends Schmuckstueck {

    private String brand;

    public Uhr(String id, double valueInUSD, String description, String brand) {
        super(id, valueInUSD, description);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Brand: " + brand + "\n";
    }
}
