package ab.objektorientierte_programmierung.fussball;

import java.util.ArrayList;
import java.util.List;

import static ab.objektorientierte_programmierung.fussball.Gameplay.runGame;

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

        Mannschaft homeTeam = new Mannschaft(
                "Königsberger Pickelhauben",
                trainer,
                torwart,
                listOfSpieler
        );

        Mannschaft guestTeam = new Mannschaft(
                "Böhmischer FB",
                trainer,
                torwart,
                listOfSpieler
        );

        Spiel spiel = new Spiel(
                homeTeam,
                guestTeam
        );

        System.out.println(trainer + "\n");
        System.out.println(spieler + "\n");
        System.out.println(torwart + "\n");
        System.out.println("Avg Motivation of Home Team: " + homeTeam.getMotivation() + "\n");
        System.out.println("Avg Strength of Home Team: " + homeTeam.getStrength() + "\n");
        spiel.getResult().incrementGoalCountOfHomeTeam();

        runGame(spiel);
        System.out.println(spiel);
    }
}
