package ab.objektorientierte_programmierung.fussball;

class Spiel {

    private final Mannschaft teamA;
    private final Mannschaft teamB;
    private final Ergebnis result = new Ergebnis();
    private final StringBuilder gameplay = new StringBuilder();

    public Spiel(Mannschaft teamA, Mannschaft teamB) {
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public Mannschaft getTeamA() {
        return teamA;
    }

    public Mannschaft getTeamB() {
        return teamB;
    }

    public Ergebnis getResult() {
        return result;
    }

    public StringBuilder getGameplay() {
        return gameplay;
    }

    @Override
    public String toString() {
        return this.gameplay.append("").toString();
    }
}
