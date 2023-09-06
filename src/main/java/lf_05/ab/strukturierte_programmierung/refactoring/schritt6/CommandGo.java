package lf_05.ab.strukturierte_programmierung.refactoring.schritt6;

class CommandGo implements ICommand {

    private Spieler spieler;
    private Richtungen richtung;

    public CommandGo(Spieler spieler, Richtungen richtung) {
        this.spieler = spieler;
        this.richtung = richtung;
    }

    @Override
    public void execute() {
        System.out.println("Wohin m�chtest Du gehen?");
        Bereich neuerBereich = spieler.getBereich().getNachbar(this.richtung);
        if (neuerBereich == null) {
            System.out.println("Dort geht es nicht weiter.");
        }
        else {
            try {
                spieler.geheInBereich(neuerBereich);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Du befindest dich " + spieler.getBereich().getBeschreibung() + ".");
            System.out.println(spieler.getBereich().getInfo());
        }
    }
}
