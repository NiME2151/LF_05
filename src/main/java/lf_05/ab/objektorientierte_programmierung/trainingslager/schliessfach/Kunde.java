package lf_05.ab.objektorientierte_programmierung.trainingslager.schliessfach;

class Kunde extends Person {

    private Adresse address;

    public Kunde(String firstName, String surname, Adresse address) {
        super(firstName, surname);
        this.address = address;
    }

    public Adresse getAddress() {
        return address;
    }

    public void setAddress(Adresse address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Kunde:\n" +
                super.toString() +
                "Adresse: " + address;
    }
}
