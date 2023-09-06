package lf_05.ab.strukturierte_programmierung.refactoring.schritt2;

class Befehl {

    private final String befehlswort;
    private final String befehlszusatz;

    public Befehl(String befehlswort, String befehlszusatz) {
        this.befehlswort = befehlswort;
        this.befehlszusatz = befehlszusatz;
    }

    public String getBefehlswort() {
        return befehlswort;
    }

    public String getBefehlszusatz() {
        return befehlszusatz;
    }
}
