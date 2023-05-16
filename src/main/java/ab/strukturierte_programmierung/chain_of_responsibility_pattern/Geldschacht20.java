package ab.strukturierte_programmierung.chain_of_responsibility_pattern;

import java.util.List;

class Geldschacht20 extends Geldschacht {

    @Override
    public List<Geld> liefereGeldscheine(int betrag, List<Geld> geldscheine) {
        while (betrag >= 20) {
            betrag -= 20;
            geldscheine.add(new Geld20());
        }
        if (getNext() != null) {
            return getNext().liefereGeldscheine(betrag, geldscheine);
        }
        return geldscheine;
    }
}
