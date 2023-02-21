package ab.objektorientierte_programmierung.trainingslager.schliessfach;

class Adresse {

    private String street;
    private String houseNumber;
    private int zipCode;
    private String place;

    public Adresse(String street, String houseNumber, int zipCode, String place) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipCode = zipCode;
        this.place = place;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Adresse:\n" +
                "Street: " + street + '\n' +
                "House No.: " + houseNumber + '\n' +
                "ZIP code: " + zipCode + "\n" +
                "Place: " + place;
    }
}
