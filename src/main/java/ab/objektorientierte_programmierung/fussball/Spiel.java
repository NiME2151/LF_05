package ab.objektorientierte_programmierung.fussball;

class Spiel {

    private final Mannschaft homeTeam;
    private final Mannschaft guestTeam;
    private final Ergebnis result = new Ergebnis();
    private final StringBuilder gameReport = new StringBuilder();

    public Spiel(Mannschaft homeTeam, Mannschaft guestTeam) {
        this.homeTeam = homeTeam;
        this.guestTeam = guestTeam;
    }

    public Mannschaft getHomeTeam() {
        return homeTeam;
    }

    public Mannschaft getGuestTeam() {
        return guestTeam;
    }

    public Ergebnis getResult() {
        return result;
    }

    public StringBuilder getGameReport() {
        return gameReport;
    }

    public void updateGameReport(String toBeAppended) {
        this.gameReport.append(toBeAppended).append("\n");
    }

    @Override
    public String toString() {
        return "Game Report:\n" + this.gameReport + "\n" +
                "End Result:\n" +
                this.homeTeam.getName() + ": " + this.result.getGoalCountOfHomeTeam() + "\n" +
                this.guestTeam.getName() + ": " + this.result.getGoalCountOfGuestTeam();
    }
}
