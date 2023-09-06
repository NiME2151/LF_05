package lf_05.ab.strukturierte_programmierung.refactoring.schritt1;

/**
 * Diese Klasse modelliert Bereiche.Ein Bereich kann ein Gebiet, ein Haus, ein Raum etc. sein.
 * 
 * Jeder Bereich ist mit anderen Bereichen �ber Ausg�nge verbunden. M�gliche Ausg�nge liegen im Norden, Osten, S�den und Westen.
 * 
 * F�r jeden Ausgang h�lt ein Bereich eine Referenz auf den benachbarten Bereich parat.
 */
class Bereich {

	private String beschreibung;
    private Bereich nord;
    private Bereich ost;
    private Bereich sued;
    private Bereich west;

    /**
     * Konstruktor.
     * @param beschreibung	Die Beschreibung des Areals.
     */
    public Bereich(String beschreibung) {
        this.beschreibung = beschreibung;
        nord = null;
        ost = null;
        sued = null;
        west = null;
    }

    /**
     * Liefert die Beschreibung des Bereichs.
     * @return	Die Beschreibung des Bereichs.
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Definiert die benachbarten Bereiche des Bereichs. 
     * Jede Richtung f�hrt entweder in einen anderen Bereich oder ist 'null' (kein Ausgang).
     * @param nord	Der im Norden benachbarte Bereich.
     * @param ost	Der im Osten benachbarte Bereich.
     * @param sued	Der im S�den benachbarte Bereich.
     * @param west	Der im Westen benachbarte Bereich.
     */
    public void setNachbarn(Bereich nord, Bereich ost, Bereich sued, Bereich west) {
        this.nord = nord;
        this.ost = ost;
        this.sued = sued;
        this.west = west;
    }

	/**
	 * Liefert den im Norden benachbarten Bereich.
	 * @return Den im Norden benachbarten Bereich.
	 */
	public Bereich getNord() {
		return nord;
	}

	/**
	 * Liefert den im Osten benachbarten Bereich.
	 * @return Den im Osten benachbarten Bereich.
	 */
	public Bereich getOst() {
		return ost;
	}

	/**
	 * Liefert den im S�den benachbarten Bereich.
	 * @return Den im S�den benachbarten Bereich.
	 */
	public Bereich getSued() {
		return sued;
	}

	/**
	 * Liefert den im Westen benachbarten Bereich.
	 * @return Den im Westen benachbarten Bereich.
	 */
	public Bereich getWest() {
		return west;
	}

}
