package lf_05.ab.strukturierte_programmierung.refactoring.schritt5;

import java.util.LinkedList;

class Spieler {

    private final String NAME;
    private final double MAXIMALE_TRAGKRAFT;
    private int FITNESS;
    private final int FITNESS_MAX = 5000;
    private final int VERBRAUCH_GEHEN = 500;
    private LinkedList<Gegenstand> gegenstaende = new LinkedList<>();
    private Bereich bereich;

    public Spieler(String NAME, double MAXIMALE_TRAGKRAFT, int FITNESS, Bereich bereich) {
        this.NAME = NAME;
        this.MAXIMALE_TRAGKRAFT = MAXIMALE_TRAGKRAFT;
        this.FITNESS = FITNESS;
        this.bereich = bereich;
    }

    public String getNAME() {
        return NAME;
    }

    public double getMAXIMALE_TRAGKRAFT() {
        return MAXIMALE_TRAGKRAFT;
    }

    public int getFITNESS() {
        return FITNESS;
    }

    public Bereich getBereich() {
        return bereich;
    }

    public String getInfo() {
        return "Name: " + this.NAME + "\n" +
                "Maximale Tragkraft: " + this.MAXIMALE_TRAGKRAFT + "\n" +
                "Fitness: " + this.FITNESS + "\n" +
                "Gegenstände: " + this.gegenstaende + "\n" +
                "Aktueller Bereich: " + this.bereich.getInfo();
    }

    public double getTraglast() {
        double gesamteTraglast = 0.0;
        for (Gegenstand gegenstand : this.gegenstaende) {
            gesamteTraglast += gegenstand.getGEWICHT();
        }
        return gesamteTraglast;
    }

    public void aufnehmenGegenstand(String nameGegenstand) throws GegenstandNichtVorhandenException, GegenstandZuSchwerException {
        Gegenstand gegenstand = this.bereich.suchenGegenstand(nameGegenstand);
        if (!(gegenstand instanceof Nahrung)) {
            if ((getTraglast() + gegenstand.getGEWICHT()) > this.MAXIMALE_TRAGKRAFT) {
                throw new GegenstandZuSchwerException(gegenstand.getNAME());
            }
            else {
                this.bereich.entfernenGegenstand(gegenstand);
                this.gegenstaende.add(gegenstand);
            }
        }
        else {
            throw new GegenstandNichtVorhandenException(
                    "Der Gegenstand " + gegenstand.getNAME() + " ist nicht vom Typ Nahrung, und kann daher nicht aufgenommen werden."
            );
        }
    }

    public void ablegenGegenstand(String nameGegenstand) throws GegenstandNichtVorhandenException {
        Gegenstand gegenstand = null;
        for (Gegenstand g : this.gegenstaende) {
            if (g.getNAME().equals(nameGegenstand)) {
                gegenstand = g;
                break;
            }
        }
        if (gegenstand != null) {
            this.gegenstaende.remove(gegenstand);
            bereich.platzierenGegenstand(gegenstand);
        }
        else {
            throw new GegenstandNichtVorhandenException(
                    "Du hast den Gegenstand " + nameGegenstand + " nicht, daher kann er nicht abgelegt werden."
            );
        }
    }

    public void essen(String nameNahrung) throws GegenstandNichtVorhandenException, SpielerSattException {
        Gegenstand gegenstand = this.bereich.suchenGegenstand(nameNahrung);
        if (gegenstand instanceof Nahrung nahrung) {
            if ((nahrung.getNAEHRWERT() + this.FITNESS) < this.FITNESS_MAX) {
                this.FITNESS += nahrung.getNAEHRWERT();
            }
            else {
                this.FITNESS = this.FITNESS_MAX;
                throw new SpielerSattException(this);
            }
        }
        else {
            throw new GegenstandNichtVorhandenException(
                    "Die Nahrung " + nameNahrung + " ist hier nicht vorhanden und kann daher nicht gegessen werden."
            );
        }
    }

    public void geheInBereich(Bereich bereich) throws SpielerZuSchwachException {
        if (this.FITNESS - this.VERBRAUCH_GEHEN >= 0) {
            this.bereich = bereich;
        }
        else {
            throw new SpielerZuSchwachException(this);
        }
    }
}
