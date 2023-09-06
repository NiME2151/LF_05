package lf_05.ab.objektorientierte_programmierung.trainingslager.schliessfach;

class Mitarbeiter extends Person {

    public Mitarbeiter(String firstName, String surname) {
        super(firstName, surname);
    }

    @Override
    public String toString() {
        return "Mitarbeiter:\n" +
                super.toString();
    }
}
