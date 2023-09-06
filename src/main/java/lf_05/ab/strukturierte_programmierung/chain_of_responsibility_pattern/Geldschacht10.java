package lf_05.ab.strukturierte_programmierung.chain_of_responsibility_pattern;

import java.util.List;

class Geldschacht10 extends Geldschacht {

    @Override
    public void liefereGeldscheine(int betrag, List<Geld> geldscheine) {
        while (betrag >= 10) {
            betrag -= 10;
            geldscheine.add(new Geld10());
        }
        if (getNext() != null) {
            getNext().liefereGeldscheine(betrag, geldscheine);
        }
    }
}
