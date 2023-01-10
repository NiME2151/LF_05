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

        Torwart torwart = new Torwart(
                "Steffi",
                38,
                6,
                10,
                7
        );

        System.out.println(trainer);
        System.out.println();
        System.out.println(spieler);
        System.out.println();
        System.out.println(torwart);
    }
}
