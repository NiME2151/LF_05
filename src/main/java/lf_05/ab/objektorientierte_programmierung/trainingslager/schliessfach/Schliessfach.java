package lf_05.ab.objektorientierte_programmierung.trainingslager.schliessfach;

import java.util.ArrayList;

class Schliessfach {

    private final String id;
    private Kunde kunde;
    private Mitarbeiter mitarbeiter;
    private final ArrayList<Gegenstand> gegenstaende = new ArrayList<>();

    public Schliessfach(String id, Kunde kunde, Mitarbeiter mitarbeiter) {
        this.id = id;
        this.kunde = kunde;
        this.mitarbeiter = mitarbeiter;
    }

    public String getId() {
        return id;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public Mitarbeiter getMitarbeiter() {
        return mitarbeiter;
    }

    public void setMitarbeiter(Mitarbeiter mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    public void addGegenstand(Gegenstand gegenstand) {
        this.gegenstaende.add(gegenstand);
    }

    public void removeGegenstand(Gegenstand gegenstand) {
        this.gegenstaende.remove(gegenstand);
    }

    public Gegenstand getGegenstand(String id) throws CouldNotFindException {
        return this.gegenstaende.stream()
                .filter(gegenstand -> gegenstand.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new CouldNotFindException("Gegenstand", id));
    }

    @Override
    public String toString() {
        return "Schliessfach:\n" +
                "ID: " + id + '\n' +
                kunde + "\n" +
                mitarbeiter + "\n" +
                "Gegenstaende: " + gegenstaende;
    }
}
