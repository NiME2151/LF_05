package ab.strukturierte_programmierung.refactoring.schritt6;

class CommandTake implements ICommand {

    private Spieler spieler;
    private String nameGegenstand;

    public CommandTake(Spieler spieler, String nameGegenstand) {
        this.spieler = spieler;
        this.nameGegenstand = nameGegenstand;
    }

    @Override
    public void execute() {
        try {
            this.spieler.aufnehmenGegenstand(this.nameGegenstand);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
