package ab.objektorientierte_programmierung.fussball;

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

        System.out.println(trainer);
        System.out.println(spieler);
    }
}
