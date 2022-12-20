package ab.objektorientierte_programmierung.fussball;

class Spieler {

    private String name;
    private int age;
    private int strength;
    private int goalShot;
    private int motivation;
    private int goalCount;

    public Spieler(String name, int age, int strength, int goalShot, int motivation, int goalCount) {
        this.name = name;
        this.age = age;
        this.strength = strength;
        this.goalShot = goalShot;
        this.motivation = motivation;
        this.goalCount = goalCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getGoalShot() {
        return goalShot;
    }

    public void setGoalShot(int goalShot) {
        this.goalShot = goalShot;
    }

    public int getMotivation() {
        return motivation;
    }

    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }

    public int getGoalCount() {
        return goalCount;
    }

    public void setGoalCount(int goalCount) {
        this.goalCount = goalCount;
    }

    @Override
    public String toString() {
        return "Spieler{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", strength=" + strength +
                ", goalShot=" + goalShot +
                ", motivation=" + motivation +
                ", goalCount=" + goalCount +
                '}';
    }
}
