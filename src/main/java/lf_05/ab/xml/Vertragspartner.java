package lf_05.ab.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

class Vertragspartner {

    @XmlElement
    private String vorname;
    @XmlElement
    private String nachname;
    @XmlElement
    private String ausweisNr;
    @XmlAttribute(required = true)
    private Adresse adresse;

    public Vertragspartner(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getAusweisNr() {
        return ausweisNr;
    }

    public void setAusweisNr(String ausweisNr) {
        this.ausweisNr = ausweisNr;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Vertragspartner:\n" +
                "Vorname: " + vorname + "\n" +
                "Nachname: " + nachname + "\n" +
                "Ausweisnummer: " + ausweisNr + "\n" +
                "Adresse: " + adresse;
    }

    public String toCSVString() {
        return this.vorname + " " +
                this.nachname + "," +
                this.adresse.toCsvString();
    }
}
