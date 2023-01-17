package ab.objektorientierte_programmierung.fussball;

class Ergebnis {

    private int goalCountOfTeamA = 0;
    private int goalCountOfTeamB = 0;

    public int getGoalCountOfTeamA() {
        return goalCountOfTeamA;
    }

    public int getGoalCountOfTeamB() {
        return goalCountOfTeamB;
    }

    public void incrementGoalCountOfTeamA() {
        this.goalCountOfTeamA += 1;
    }

    public void incrementGoalCountOfTeamB() {
        this.goalCountOfTeamB += 1;
    }

    @Override
    public String toString() {
        return "Ergebnis: \n" +
                "Team A: " + goalCountOfTeamA + "\n" +
                "Team B: " + goalCountOfTeamB;
    }
}
