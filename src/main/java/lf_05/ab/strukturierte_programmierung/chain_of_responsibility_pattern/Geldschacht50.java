package lf_05.ab.strukturierte_programmierung.chain_of_responsibility_pattern;

import java.util.List;

class Geldschacht50 extends Geldschacht {

    @Override
    public void liefereGeldscheine(int betrag, List<Geld> geldscheine) {
        while (betrag >= 50) {
            betrag -= 50;
            geldscheine.add(new Geld50());
        }
        if (getNext() != null) {
            getNext().liefereGeldscheine(betrag, geldscheine);
        }
    }
}
