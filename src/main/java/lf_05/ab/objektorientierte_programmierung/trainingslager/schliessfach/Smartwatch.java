package lf_05.ab.objektorientierte_programmierung.trainingslager.schliessfach;

class Smartwatch extends Uhr {

    private String operatingSystem;

    public Smartwatch(String id, double valueInUSD, String description, String brand, String operatingSystem) {
        super(id, valueInUSD, description, brand);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Smartwatch:\n" +
                super.toString() +
                "OS: " + operatingSystem;
    }
}
