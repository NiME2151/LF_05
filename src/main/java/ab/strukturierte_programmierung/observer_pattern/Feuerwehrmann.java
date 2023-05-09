package ab.strukturierte_programmierung.observer_pattern;

class Feuerwehrmann implements IObserver {

    private String vorname;
    private String nachname;

    Feuerwehrmann(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    private String getVorname() {
        return vorname;
    }

    private void setVorname(String vorname) {
        this.vorname = vorname;
    }

    private String getNachname() {
        return nachname;
    }

    private void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Override
    public void notify(ICommand command) {
        command.execute();
    }
}
