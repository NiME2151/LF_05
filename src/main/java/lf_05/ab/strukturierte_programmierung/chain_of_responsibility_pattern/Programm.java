package lf_05.ab.strukturierte_programmierung.chain_of_responsibility_pattern;

import java.util.List;

class Programm {

    public static void main(String[] args) {
        doWork();
    }

    public static void doWork() {

        Geldautomat geldautomat = new Geldautomat();
        List<Geld> geldscheine = geldautomat.auszahlenGeld(185);
        geldscheine.forEach(geldschein -> System.out.println(geldschein.getWert()));
    }
}
