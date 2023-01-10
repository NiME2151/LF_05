package ab.objektorientierte_programmierung.fussball;

class Trainer extends Person {

    private int experience;

    public Trainer(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Trainer-" +
                super.toString() + "\n" +
                "Experience: " + this.experience;
    }
}
