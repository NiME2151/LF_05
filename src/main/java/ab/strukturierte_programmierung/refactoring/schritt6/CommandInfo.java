package ab.strukturierte_programmierung.refactoring.schritt6;

class CommandInfo implements ICommand {

    private Spieler spieler;

    public CommandInfo(Spieler spieler) {
        this.spieler = spieler;
    }

    @Override
    public void execute() {
        System.out.println(this.spieler.getInfo());
    }
}
