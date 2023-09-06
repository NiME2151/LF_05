package lf_05.ab.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

class Programm {

    public static void main(String[] args) {
        String datei = "src/main/ab/xml/test.xml";
        JAXBContext jaxbContext;
        List<Vertragspartner> vertragspartnerList = init();
        Kaufvertrag kaufvertrag = new Kaufvertrag(
                vertragspartnerList.get(0),
                vertragspartnerList.get(1),
                new Ware("Ware1", 100.0)
        );
        XmlKaufvertrag xmlKaufvertrag = new XmlKaufvertrag(kaufvertrag);
        try {
            jaxbContext = JAXBContext.newInstance(XmlKaufvertrag.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(xmlKaufvertrag, new File(datei));
        }
        catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Vertragspartner> init() {
        Adresse verkaeuferAdresse = new Adresse(
                "Hauptstraße",
                "100",
                "28215",
                "Bremen"
        );
        Adresse kaeuferAdresse = new Adresse(
                "Hauptstraße",
                "200",
                "28217",
                "Bremen"
        );
        Vertragspartner verkaeufer = new Vertragspartner(
                "Nico Michael",
                "von Corondelle"
        );
        verkaeufer.setAdresse(verkaeuferAdresse);
        verkaeufer.setAusweisNr("001");
        Vertragspartner kaeufer = new Vertragspartner(
                "Nikki",
                "von Corondelle"
        );
        kaeufer.setAdresse(kaeuferAdresse);
        kaeufer.setAusweisNr("002");
        return new ArrayList<>(List.of(verkaeufer, kaeufer));
    }
}
