package lf_05.ab.strukturierte_programmierung.refactoring.schritt5;

class BefehlFactory {

    public static Befehl createBefehl(String eingabe) throws BefehlUnbekanntException {
        if (eingabe.length() > 0) {
            String[] befehlsteile = eingabe.trim().split(" ");
            befehlsteile[0] = befehlsteile[0].toLowerCase();
            switch (befehlsteile[0]) {
                case "go" -> {
                    if (eingabe.length() > 1) {
                        befehlsteile[1] = befehlsteile[1].toLowerCase();
                        for (Richtungen richtung : Richtungen.values()) {
                            if (richtung.name().equalsIgnoreCase(befehlsteile[1])) {
                                return new Befehl(befehlsteile[0], befehlsteile[1]);
                            }
                        }
                        throw new BefehlUnbekanntException("Ihre Eingabe \"" + befehlsteile[1] + "\" ist keine gültige Richtungsangabe");
                    }
                    else {
                        throw new BefehlUnbekanntException("Der \"go\"-Befehl kann nicht ausgeführt werden, da keine Richtung angegeben wurde");
                    }
                }
                case "help", "quit" -> {
                    return new Befehl(befehlsteile[0], null);
                }
                default -> {
                    throw new BefehlUnbekanntException("Der Befehl \"" + eingabe + "\" ist kein gültiger Befehl");
                }
            }
        }
        throw new BefehlUnbekanntException("Es konnte kein Befehl erkannt werden, da ihre Eingabe leer ist");
    }
}
