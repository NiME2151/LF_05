package lf_05.ab.objektorientierte_programmierung.fussball;

class Ergebnis {

    private int goalCountOfHomeTeam = 0;
    private int goalCountOfGuestTeam = 0;

    public int getGoalCountOfHomeTeam() {
        return goalCountOfHomeTeam;
    }

    public int getGoalCountOfGuestTeam() {
        return goalCountOfGuestTeam;
    }

    public void incrementGoalCountOfHomeTeam() {
        this.goalCountOfHomeTeam += 1;
    }

    public void incrementGoalCountOfGuestTeam() {
        this.goalCountOfGuestTeam += 1;
    }

    @Override
    public String toString() {
        return "Results: \n" +
                "Home Team: " + goalCountOfHomeTeam + "\n" +
                "Guest Team: " + goalCountOfGuestTeam;
    }
}
