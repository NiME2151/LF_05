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
                "Königsberger Pickelhauben",
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

        System.out.println(trainer + "\n");
        System.out.println(spieler + "\n");
        System.out.println(torwart + "\n");
        System.out.println("Avg Motivation T1: " + mannschaft1.getMotivation() + "\n");
        System.out.println("Avg Strength T1: " + mannschaft1.getStrength() + "\n");
        spiel.getResult().incrementGoalCountOfTeamA();
        System.out.println(spiel);
    }
}
