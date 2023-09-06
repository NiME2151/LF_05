package lf_05.ab.objektorientierte_programmierung.fussball;

class Spieler extends Person {

    private int strength;
    private int goalShot;
    private int motivation;
    private int goalCount;

    public Spieler(String name, int age, int strength, int goalShot, int motivation, int goalCount) {
        super(name, age);
        this.strength = strength;
        this.goalShot = goalShot;
        this.motivation = motivation;
        this.goalCount = goalCount;
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

    public void incrementGoalCount() {
        this.goalCount += 1;
    }

    @Override
    public String toString() {
        return "Spieler-" +
                super.toString() + "\n" +
                "Goal Shot: " + this.goalShot + "\n" +
                "Motivation: " + this.motivation + "\n" +
                "Goal Count: " + this.goalCount;
    }
}
