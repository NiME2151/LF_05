package ab.objektorientierte_programmierung.trainingslager.schliessfach;

class GegenstandFactory {

    public static Aktie createAktie(String id, String company, double value) {
        return new Aktie(id, company, value);
    }

    public static Kette createKette(String id, double value, String desciption, int lengthInCentimeters) {
        return new Kette(id, value, desciption, lengthInCentimeters);
    }

    public static Ring createRing(String id, double value, String description, int sizeInCentimeters) {
        return new Ring(id, value, description, sizeInCentimeters);
    }

    public static Uhr createUhr(String id, double value, String description, String brand) {
        return new Uhr(id, value, description, brand);
    }

    public static Smartwatch createSmartwatch(String id, double value, String description, String brand, String operatingSystem) {
        return new Smartwatch(id, value, description, brand, operatingSystem);
    }
}
