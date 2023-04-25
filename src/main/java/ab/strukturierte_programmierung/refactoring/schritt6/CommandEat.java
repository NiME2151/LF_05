package ab.strukturierte_programmierung.refactoring.schritt6;

class CommandEat implements ICommand {

    private Spieler spieler;
    private String nameGegenstand;

    public CommandEat(Spieler spieler, String nameGegenstand) {
        this.spieler = spieler;
        this.nameGegenstand = nameGegenstand;
    }

    @Override
    public void execute() {
        try {
            this.spieler.essen(this.nameGegenstand);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
