package ab.strukturierte_programmierung.chain_of_responsibility_pattern;

import java.util.List;

class Geldschacht5 extends Geldschacht {

    @Override
    public void liefereGeldscheine(int betrag, List<Geld> geldscheine) {
        while (betrag >= 5) {
            betrag -= 5;
            geldscheine.add(new Geld5());
        }
        if (getNext() != null) {
            getNext().liefereGeldscheine(betrag, geldscheine);
        }
    }
}
