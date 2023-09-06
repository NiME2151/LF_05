package lf_05.ab.objektorientierte_programmierung.trainingslager.inventar;

class Techniker {

    private String firstName;
    private String surname;
    private Kontakt contact;

    public Techniker(String firstName, String surname, Kontakt contact) {
        this.firstName = firstName;
        this.surname = surname;
        this.contact = contact;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Kontakt getContact() {
        return contact;
    }

    public void setContact(Kontakt contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Techniker:\n" +
                "First name: " + this.firstName + "\n" +
                "Surname: " + this.surname + "\n" +
                this.contact;
    }
}
