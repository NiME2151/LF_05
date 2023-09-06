package lf_05.ab.strukturierte_programmierung.chain_of_responsibility_pattern;

import java.util.List;

abstract class Geldschacht {

    private Geldschacht next;

    protected Geldschacht getNext() {
        return next;
    }

    public void setNext(Geldschacht next) {
        this.next = next;
    }

    public abstract void liefereGeldscheine(int betrag, List<Geld> geldscheine);
}
