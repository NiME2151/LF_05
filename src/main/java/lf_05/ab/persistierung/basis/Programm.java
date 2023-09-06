package lf_05.ab.persistierung.basis;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Programm {

    public static void main(String[] args) throws IOException {

        // general path
        String dateiPfad = "src/main/java/ab/persistierung/basis/dateien/";
        // txt writing
        String txtDatei = dateiPfad + "test.txt";
        PrintWriter txtWriter = new PrintWriter(txtDatei);
        txtWriter.println("Hello World");
        txtWriter.close();

        // csv write and read
        String csvDatei = schreibeCsv(dateiPfad);
        leseCsv(csvDatei);
    }

    public static String schreibeVertragspartner(Vertragspartner vertragspartner) {
        Adresse adresse = vertragspartner.getAdresse();
        return vertragspartner.getVorname() + "," +
                vertragspartner.getNachname() + "," +
                vertragspartner.getAusweisNr() + "," +
                adresse.getStrasse() + "," +
                adresse.getHausNr() + "," +
                adresse.getPlz() + "," +
                adresse.getOrt();
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

    public static String schreibeCsv(String dateiPfad) throws FileNotFoundException {
        List<Vertragspartner> vertragspartners = init();
        String csvDatei = dateiPfad + "vertragspartner.csv";
        PrintWriter csvWriter = new PrintWriter(csvDatei);
        csvWriter.println("Vertragspartner,Vorname,Nachname,Ausweisnummer,Straße,Hausnummer,PLZ,Ort");
        csvWriter.println(
                "Verkäufer," + schreibeVertragspartner(vertragspartners.get(0)) + "\n" +
                "Käufer," + schreibeVertragspartner(vertragspartners.get(1))
        );
        csvWriter.close();
        return csvDatei;
    }

    public static void leseCsv(String csvDatei) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(csvDatei));
        String zeile;
        List<String[]> zeilen = new ArrayList<>();
        while ((zeile = bufferedReader.readLine()) != null) {
            String[] aktuelleZeile = zeile.trim().split(",");
            zeilen.add(aktuelleZeile);
        }
        zeilen.remove(0);
        for (String[] z : zeilen) {
            Vertragspartner vertragspartner = new Vertragspartner(z[1], z[2]);
            vertragspartner.setAusweisNr(z[3]);
            vertragspartner.setAdresse(new Adresse(z[4], z[5], z[6], z[7]));
            System.out.println(vertragspartner);
        }
    }
}
