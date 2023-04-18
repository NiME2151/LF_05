package ab.strukturierte_programmierung.refactoring.schritt5;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * Diese Klasse modelliert Bereiche.Ein Bereich kann ein Gebiet, ein Haus, ein Raum etc. sein.
 * 
 * Jeder Bereich ist mit anderen Bereichen �ber Ausg�nge verbunden. M�gliche Ausg�nge liegen im Norden, Osten, S�den und Westen.
 * 
 * F�r jeden Ausgang h�lt ein Bereich eine Referenz auf den benachbarten Bereich parat.
 */
class Bereich {

	private String beschreibung;
	private Map<Richtungen, Bereich> nachbarn;
	private LinkedList<Gegenstand> gegenstaende = new LinkedList<>();

    /**
     * Konstruktor.
     * @param beschreibung	Die Beschreibung des Areals.
     */
    public Bereich(String beschreibung) {
        this.beschreibung = beschreibung;
        nachbarn = new HashMap<>();
		for (Richtungen richtungen : Richtungen.values()) {
			nachbarn.put(richtungen, null);
		}
    }

    /**
     * Liefert die Beschreibung des Bereichs.
     * @return	Die Beschreibung des Bereichs.
     */
    public String getBeschreibung() {
        return beschreibung;
    }

	public Bereich getNachbar(Richtungen richtung) {
		return nachbarn.get(richtung);
	}

	public void setNachbar(Richtungen richtung, Bereich bereich) {
		nachbarn.put(richtung, bereich);
	}

	public String getInfo() {
		StringBuilder info = new StringBuilder();
		if (this.gegenstaende.size() == 0) {
			info.append("In diesem Bereich sind keine Gegenstände vorhanden");
		}
		else {
			info.append("Folgende Gegenstände sind in diesem Bereich vorhanden:");
		}
		for (Gegenstand gegenstand : this.gegenstaende) {
			info.append("\n\t").append(gegenstand.getNAME());
		}
		info.append("\n").append("Du kannst in folgende Richtungen gehen:");
		for (Map.Entry<Richtungen, Bereich> paar : nachbarn.entrySet()) {
			if (paar.getValue() != null) {
				info.append("\n\t").append(paar.getKey().name().toLowerCase());
			}
		}
		return info.toString();
	}

	public void platzierenGegenstand(Gegenstand gegenstand) {
		this.gegenstaende.add(gegenstand);
	}

	public void entfernenGegenstand(Gegenstand gegenstand) throws GegenstandNichtVorhandenException {
		if (!this.gegenstaende.remove(gegenstand)) {
			throw new GegenstandNichtVorhandenException(
					"Der Gegenstand " + gegenstand.getNAME() + " konnte nicht entfernt werden, da er nicht vorhanden ist."
			);
		}
	}

	public Gegenstand suchenGegenstand(String nameGegenstand) throws GegenstandNichtVorhandenException {
		return this.gegenstaende.stream()
				.filter((gegenstand -> gegenstand.getNAME().equals(nameGegenstand)))
				.findFirst()
				.orElseThrow(() -> new GegenstandNichtVorhandenException(
						"Der Gegenstand " + nameGegenstand + " konnte nicht gefunden werden."
				));
	}
}
