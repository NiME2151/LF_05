package lf_05.ab.objektorientierte_programmierung.trainingslager.schliessfach;

abstract class Person {

    private String firstName;
    private String surname;

    public Person(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;
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

    @Override
    public String toString() {
        return "First Name: " + firstName + '\n' +
                "Surname: " + surname + '\n';
    }
}
