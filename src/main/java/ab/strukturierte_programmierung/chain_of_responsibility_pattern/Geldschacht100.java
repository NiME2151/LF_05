package ab.strukturierte_programmierung.chain_of_responsibility_pattern;

import java.util.List;

class Geldschacht100 extends Geldschacht {

    @Override
    public List<Geld> liefereGeldscheine(int betrag, List<Geld> geldscheine) {
        while (betrag >= 100) {
            betrag -= 100;
            geldscheine.add(new Geld100());
        }
        if (getNext() != null) {
            return getNext().liefereGeldscheine(betrag, geldscheine);
        }
        return geldscheine;
    }
}
