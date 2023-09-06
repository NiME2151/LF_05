package lf_05.ab.strukturierte_programmierung.refactoring.schritt4;

import java.util.HashMap;
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
		for (Map.Entry<Richtungen, Bereich> paar : nachbarn.entrySet()) {
			if (paar.getValue() != null) {
				info.append("\n\t").append(paar.getKey().name().toLowerCase());
			}
		}
		return info.toString();
	}
}
