package lf_05.ab.strukturierte_programmierung.refactoring.schritt6;

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

	private Spieler spieler;
	public Spiel() {
		erzeugeDorf();
	}

	/**
     * Die Hauptmethode zum Spielen. 
     * L�uft bis zum Ende des Spiels in einer Schleife.
     */
    public void spielen() throws BefehlUnbekanntException {
		ausgebenStartText();

        Scanner scannerZeile = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.print("> ");
            String input = scannerZeile.nextLine();
            ICommand command = CommandFactory.createCommand(spieler, input);
            command.execute();
			end = command instanceof CommandQuit;
		}
        
		ausgebenEndText();
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
		System.out.println("Du befindest dich " + spieler.getBereich().getBeschreibung() + ".");
		System.out.println(spieler.getBereich().getInfo());
	}

	private void erzeugeDorf() {
		// Die Bereiche erzeugen.
		Bereich friedhof = new Bereich("auf einem Friedhof, umgeben von dunklen Tannen");
		Bereich wald = new Bereich("im dunklen Stadtwald von Nogard");
		Bereich taverne = new Bereich("in der Taverne, mit zwielichtigen Gestalten an der Theke");
		Bereich hexenhaus = new Bereich("im finsteren Hexenhaus");
		Bereich rathaus = new Bereich("im Rathaus von Nogard");
		Bereich weinkeller = new Bereich("im Weinkeller unter der Taverne");
		Bereich kraeuterkeller = new Bereich("im Kräuterkeller unter dem Hexenhaus");

		// Die Nachbarschaften festlegen.
		friedhof.setNachbar(Richtungen.SOUTH, hexenhaus);
		wald.setNachbar(Richtungen.NORTH, hexenhaus);
		wald.setNachbar(Richtungen.EAST, taverne);
		taverne.setNachbar(Richtungen.NORTH, rathaus);
		taverne.setNachbar(Richtungen.WEST, wald);
		taverne.setNachbar(Richtungen.DOWN, weinkeller);
		weinkeller.setNachbar(Richtungen.UP, taverne);
		hexenhaus.setNachbar(Richtungen.NORTH, friedhof);
		hexenhaus.setNachbar(Richtungen.EAST, rathaus);
		hexenhaus.setNachbar(Richtungen.DOWN, kraeuterkeller);
		kraeuterkeller.setNachbar(Richtungen.UP, hexenhaus);
		hexenhaus.setNachbar(Richtungen.SOUTH, wald);
		rathaus.setNachbar(Richtungen.SOUTH, taverne);
		rathaus.setNachbar(Richtungen.WEST, hexenhaus);

		// Platziere Gegenstände
        friedhof.platzierenGegenstand(new Gegenstand("Taschentuch", "zum Trocknen deiner Tränen", 0.1));
        hexenhaus.platzierenGegenstand(new Gegenstand("Kessel", "zum Kochen der Zaubertränke", 5.0));
        hexenhaus.platzierenGegenstand(new Gegenstand("Krug", "mit fauligem Krötenwasser", 5.0));
        hexenhaus.platzierenGegenstand(new Gegenstand("Schale", "mit getrockneten Kräutern", 2.5));
        hexenhaus.platzierenGegenstand(new Nahrung("Froschschenkel", "mit ranziger Knoblauchbutter", 700));
        taverne.platzierenGegenstand(new Nahrung("Bier", "mit luftiger Krone", 500));
        taverne.platzierenGegenstand(new Nahrung("Wildschweinbraten", "mit Klößen und klumpiger Soße", 1200));
        taverne.platzierenGegenstand(new Gegenstand("Tisch", "mit verschmierten Essensresten und dicken Kerben", 35.0));
        taverne.platzierenGegenstand(new Gegenstand("Stuhl", "mit wackligen Beinen und gebrochener Lehne", 2.5));
        wald.platzierenGegenstand(new Nahrung("Pilze", "leuchtend rot mit weißen Punkten", 200));
        weinkeller.platzierenGegenstand(new Gegenstand("Fass", "mit lange gelagertem Rotwein", 10.0));

		this.spieler = new Spieler(
				"Nico",
				10.0,
				5000,
				hexenhaus
		);
	}
}
