package ab.strukturierte_programmierung.chain_of_responsibility_pattern;

import java.util.ArrayList;
import java.util.List;

class Geldautomat {

    private Geldschacht100 geldschacht100 = new Geldschacht100();
    private Geldschacht50 geldschacht50 = new Geldschacht50();
    private Geldschacht20 geldschacht20 = new Geldschacht20();
    private Geldschacht10 geldschacht10 = new Geldschacht10();
    private Geldschacht5 geldschacht5 = new Geldschacht5();

    public Geldautomat() {
        geldschacht100.setNext(geldschacht50);
        geldschacht50.setNext(geldschacht20);
        geldschacht20.setNext(geldschacht10);
        geldschacht10.setNext(geldschacht5);
    }

    public List<Geld> auszahlenGeld(int betrag) {
        List<Geld> geldscheine = new ArrayList<>();
        this.geldschacht100.liefereGeldscheine(betrag, geldscheine);
        return geldscheine;
    }
}
