package lf_05.ab.strukturierte_programmierung.refactoring.schritt6;

class Programm {

	public static void main(String[] args) throws BefehlUnbekanntException, SpielerZuSchwachException, SpielerSattException, GegenstandZuSchwerException, GegenstandNichtVorhandenException {
		Spiel spiel = new Spiel();
		spiel.spielen();
	}
}
