package lf_05.ab.strukturierte_programmierung.refactoring.schritt6;

class CommandPut implements ICommand {

    private Spieler spieler;
    private String nameGegenstand;

    public CommandPut(Spieler spieler, String nameGegenstand) {
        this.spieler = spieler;
        this.nameGegenstand = nameGegenstand;
    }

    @Override
    public void execute() {
        try {
            this.spieler.ablegenGegenstand(this.nameGegenstand);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
