package lf_05.ab.objektorientierte_programmierung.trainingslager.schliessfach;

import java.io.IOException;
import java.util.List;

class Runner {

    public static void main(String[] args) throws IOException {

        Adresse adresse = new Adresse(
                "Erste Straße",
                "1",
                28215,
                "Bremen"
        );

        Kunde kunde = new Kunde(
                "Nico",
                "Meyer",
                adresse
        );
        Mitarbeiter mitarbeiter = new Mitarbeiter(
                "Nikki",
                "von Corondelle"
        );

        List<Schliessfach> schliessfaecher = List.of(
                new Schliessfach(
                        "A-001",
                        kunde,
                        mitarbeiter
                )
        );

        Schliessfach selectedSchliessfach = null;

        Bankverwaltungssystem bankverwaltungssystem = new Bankverwaltungssystem(schliessfaecher);
        try {
            selectedSchliessfach = bankverwaltungssystem.getSchliessfachById("A-001");
        } catch (CouldNotFindException e) {
            e.getMessage();
        }

        Aktie aktie = GegenstandFactory.createAktie(
                "2151",
                "CORONDELLE Corporation",
                10.5
        );

        Smartwatch smartwatch = GegenstandFactory.createSmartwatch(
                "4180",
                25_000,
                "A Smartwatch by Mayfield Industries Inc.",
                "MI Watches",
                "miOS"
        );

        selectedSchliessfach.addGegenstand(aktie);
        selectedSchliessfach.addGegenstand(smartwatch);
        try {
            System.out.println(selectedSchliessfach.getGegenstand("2151").toString());
            System.out.println(selectedSchliessfach.getGegenstand("4180").toString());
        } catch (CouldNotFindException e) {
            e.getMessage();
        }
        System.out.println(selectedSchliessfach);
        selectedSchliessfach.removeGegenstand(aktie);
    }
}
