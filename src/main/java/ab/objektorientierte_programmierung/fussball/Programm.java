package ab.objektorientierte_programmierung.fussball;

import java.util.ArrayList;
import java.util.List;

class Programm {

    public static void main(String[] args) {

        Trainer trainer = new Trainer(
                "Nico",
                22,
                5
        );

        Spieler spieler = new Spieler(
                "Marc",
                20,
                7,
                8,
                3,
                12
        );

        Torwart torwart = new Torwart(
                "Steffi",
                38,
                6,
                10,
                7
        );

        ArrayList<Spieler> listOfSpieler = new ArrayList<>(
                List.of(
                        new Spieler("A", 20, 10, 5, 4, 8),
                        new Spieler("B", 22, 6, 7, 8, 2)
                )
        );

        Mannschaft mannschaft1 = new Mannschaft(
                "Königsberger Pikelhauben",
                trainer,
                torwart,
                listOfSpieler
        );

        Mannschaft mannschaft2 = new Mannschaft(
                "Böhmischer FB",
                trainer,
                torwart,
                listOfSpieler
        );

        Spiel spiel = new Spiel(
                mannschaft1,
                mannschaft2
        );

        System.out.println(trainer);
        System.out.println();
        System.out.println(spieler);
        System.out.println();
        System.out.println(torwart);
        System.out.println();
        System.out.println("Avg Team Motivation: " + mannschaft1.getMotivation());
        System.out.println("Avg Team Strength: " + mannschaft1.getStrength());
        System.out.println();
        spiel.getResult().incrementGoalCountOfTeamA();
        System.out.println(spiel);
    }
}
