package lf_05.ab.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

class Ware {

    @XmlAttribute(required = true)
    private String bezeichnung;
    @XmlElement
    private String beschreibung;
    @XmlElement
    private double preis;
    @XmlElement
    private List<String> besonderheiten;
    @XmlElement
    private List<String> maengel;

    public Ware(String bezeichnung, double preis) {
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    private String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public List<String> getBesonderheiten() {
        return besonderheiten;
    }

    public List<String> getMaengel() {
        return maengel;
    }

    @Override
    public String toString() {
        return "Ware:\n" +
                "Bezeichnung: " + bezeichnung + "\n" +
                "Beschreibung: " + beschreibung + "\n" +
                "Preis: " + preis + "\n" +
                "Besonderheiten: " + besonderheiten + "\n" +
                "Mängel: " + maengel;
    }
}
