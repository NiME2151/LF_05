package lf_05.ab.xml;

import javax.xml.bind.annotation.XmlElement;

class Kaufvertrag {

    @XmlElement
    private Vertragspartner verkaeufer;
    @XmlElement
    private Vertragspartner kaeufer;
    @XmlElement
    private Ware ware;
    @XmlElement
    private String zahlung;

    public Kaufvertrag(Vertragspartner verkaeufer, Vertragspartner kaeufer, Ware ware) {
        this.verkaeufer = verkaeufer;
        this.kaeufer = kaeufer;
        this.ware = ware;
    }

    public Vertragspartner getVerkaeufer() {
        return verkaeufer;
    }

    public Vertragspartner getKaeufer() {
        return kaeufer;
    }

    public void setKaeufer(Vertragspartner kaeufer) {
        this.kaeufer = kaeufer;
    }

    public Ware getWare() {
        return ware;
    }

    public void setWare(Ware ware) {
        this.ware = ware;
    }

    public String getZahlung() {
        return zahlung;
    }

    public void setZahlung(String zahlung) {
        this.zahlung = zahlung;
    }

    @Override
    public String toString() {
        return "Kaufvertrag:\n" +
                "Verkäufer: " + verkaeufer + "\n" +
                "Käufer: " + kaeufer + "\n" +
                "Ware: " + ware + "\n" +
                "Zahlungsmodalitäten: " + zahlung;
    }
}
