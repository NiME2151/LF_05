package ab.strukturierte_programmierung.refactoring.schritt2;

import java.util.Scanner;

/**
 *  Dies ist die Hauptklasse der Anwendung "Die Welt von Nogard".
 *  
 *  "Die Welt von Nogard" ist ein sehr einfaches, textbasiertes Adventure-Game, in dem sich ein Spieler durch Nogard bewegen kann. 
 *  
 *  Das Spiel sollte auf jeden Fall ausgebaut werden, damit es interessanter wird!
 * 
 *  Zum Spielen muss an einer Instanz dieser Klasse die Methode "spielen()" aufgerufen werden.
 * 
 *  Diese Klasse erzeugt und initialisiert alle Objekte der Anwendung: 
 *  - Sie legt alle Bereiche an. Anschlie�end startet das Spiel. 
 *  - Sie wertet die Befehle aus und sorgt f�r ihre Ausf�hrung.
 */
class Spiel {
	private Bereich aktiverBereich;

	public Spiel() {
		erzeugeDorf();
	}

	/**
     * Die Hauptmethode zum Spielen. 
     * L�uft bis zum Ende des Spiels in einer Schleife.
     */
    public void spielen() throws BefehlUnbekanntException {
		ausgebenStartText();

		// Befehle einlesen und auswerten.
        Scanner scannerZeile = new Scanner(System.in);
        boolean end = false;
        while (! end) {
            // Eingabeaufforderung anzeigen.
            System.out.print("> ");
            // Befehlszeile lesen.
            String input = scannerZeile.nextLine();
            // Befehl interpretieren.
            Befehl befehl = BefehlFactory.createBefehl(input);
			end = ausfuehrenBefehl(befehl);
		}
        
        // Endbildschirm ausgeben.
		ausgebenEndText();
	}

	private boolean ausfuehrenBefehl(Befehl befehl) {
		boolean end;
		// Auswerten des Befehls.
		switch (befehl.getBefehlswort()) {
			case "go" -> {
				wechselBereich(befehl);
				end = false;
			}
			case "help" -> {
				ausgebenHilfeText();
				end = false;
			}
			case "quit" -> {
				end = true;
			}
			default -> {
				ausgebenFehlerBefehl();
				end = false;
			}
		}
		return end;
	}

	private void wechselBereich(Befehl befehl) {
		System.out.println("Wohin m�chtest Du gehen?");
		Bereich neuerBereich;
		switch (befehl.getBefehlszusatz()) {
			case "north" -> {
				neuerBereich = aktiverBereich.getNord();
			}
			case "east" -> {
				neuerBereich = aktiverBereich.getOst();
			}
			case "south" -> {
				neuerBereich = aktiverBereich.getSued();
			}
			case "west" -> {
				neuerBereich = aktiverBereich.getWest();
			}
			default -> neuerBereich = null;
		}
		// Auswertung der gefundenen Bereichs.
		if (neuerBereich == null) {
			System.out.println("Dort geht es nicht weiter.");
		}
		else {
			aktiverBereich = neuerBereich;
			System.out.println("Du befindest dich " + aktiverBereich.getBeschreibung() + ".");
			System.out.println("Du kannst gehen nach:");
			ausgebenBereicheInfo();
		}
	}

	private static void ausgebenHilfeText() {
		System.out.println("Du irrst in Nogard herum.");
		System.out.println("Dir stehen folgende Befehle zur Verf�gung:");
		System.out.println("\tgo");
		System.out.println("\tquit");
		System.out.println("\thelp");
	}

	private static void ausgebenEndText() {
		System.out.println("Danke f�r dieses Spiel. Auf Wiedersehen.");
	}

	private void ausgebenStartText() {
		// Begr��ungsbildschirm ausgeben.
		System.out.println("Willkommen in Nogard!");
		System.out.println("Entdecke die Welt von Nogard. Doch Vorsicht, �berall lauern Gefahren!");
		System.out.println("Wenn du Hilfe ben�tigst, tippe 'help'.");
		System.out.println();
		System.out.println("Du befindest dich " + aktiverBereich.getBeschreibung() + ".");
		System.out.println("Du kannst gehen nach:");
		ausgebenBereicheInfo();
	}

	private void erzeugeDorf() {
		// Die Bereiche erzeugen.
		Bereich friedhof = new Bereich("auf einem Friedhof, umgeben von dunklen Tannen");
		Bereich wald = new Bereich("im dunklen Stadtwald von Nogard");
		Bereich taverne = new Bereich("in der Taverne, mit zwielichtigen Gestalten an der Theke");
		Bereich hexenhaus = new Bereich("im finsteren Hexenhaus");
		Bereich rathaus = new Bereich("im Rathaus von Nogard");

		// Die Nachbarschaften festlegen.
		friedhof.setNachbarn(null, null, hexenhaus, null);
		wald.setNachbarn(hexenhaus, taverne, null, null);
		taverne.setNachbarn(rathaus, null, null, wald);
		hexenhaus.setNachbarn(friedhof, rathaus, wald, null);
		rathaus.setNachbarn(null, null, taverne, hexenhaus);

		// Das Spielt startet im Wald.
		aktiverBereich = wald;
	}

	private static void ausgebenFehlerBefehl() {
		System.out.println("Ich wei� nicht, was Du meinst ...");
	}

	private void ausgebenBereicheInfo() {
		if(aktiverBereich.getNord() != null) {
			System.out.println("\tNorden.");
		}
		if(aktiverBereich.getOst() != null) {
			System.out.println("\tOsten.");
		}
		if(aktiverBereich.getSued() != null) {
			System.out.println("\tS�den.");
		}
		if(aktiverBereich.getWest() != null) {
			System.out.println("\tWesten.");
		}
	}

}
