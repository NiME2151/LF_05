package ab.strukturierte_programmierung.refactoring.schritt6;

class CommandFactory {

    public static ICommand createCommand(Spieler spieler, String eingabe) throws BefehlUnbekanntException {
        if (eingabe.length() > 0) {
            String[] befehlsteile = eingabe.trim().split(" ");
            befehlsteile[0] = befehlsteile[0].toLowerCase();
            return switch (befehlsteile[0]) {
                case "eat" -> createCommandEat(spieler, befehlsteile[1]);
                case "go" -> createCommandGo(spieler, befehlsteile);
                case "help" -> createCommandHelp();
                case "info" -> createCommandInfo(spieler);
                case "put" -> createCommandPut(spieler, befehlsteile[1]);
                case "quit" -> createCommandQuit();
                case "take" -> createCommandTake(spieler, befehlsteile[1]);
                default ->
                        throw new BefehlUnbekanntException("Es konnte kein Befehl erkannt werden, da ihre Eingabe nicht erkannt wurde");
            };
        }
        else {
            throw new BefehlUnbekanntException("Es konnte kein Befehl erkannt werden, da ihre Eingabe leer ist");
        }
    }

    private static ICommand createCommandTake(Spieler spieler, String nameGegenstand) {
        return new CommandTake(spieler, nameGegenstand);
    }

    private static ICommand createCommandQuit() {
        return new CommandQuit();
    }

    private static ICommand createCommandPut(Spieler spieler, String nameGegenstand) {
        return new CommandPut(spieler, nameGegenstand);
    }

    private static ICommand createCommandInfo(Spieler spieler) {
        return new CommandInfo(spieler);
    }

    private static ICommand createCommandHelp() {
        return new CommandHelp();
    }

    private static ICommand createCommandGo(Spieler spieler, String[] befehlsteile) throws BefehlUnbekanntException {
        befehlsteile[1] = befehlsteile[1].toLowerCase();
        for (Richtungen richtung : Richtungen.values()) {
            if (richtung.name().equalsIgnoreCase(befehlsteile[1])) {
                return new CommandGo(
                        spieler,
                        richtung
                );
            }
        }
        throw new BefehlUnbekanntException("Ihre Eingabe \"" + befehlsteile[1] + "\" ist keine gültige Richtungsangabe");
    }

    private static ICommand createCommandEat(Spieler spieler, String nameNahrung) {
        return new CommandEat(spieler, nameNahrung);
    }
}
