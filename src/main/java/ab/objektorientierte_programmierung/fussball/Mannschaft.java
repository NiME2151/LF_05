package ab.objektorientierte_programmierung.fussball;

import java.util.ArrayList;

class Mannschaft {

    private String name;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> listOfSpieler;

    public Mannschaft(String name, Trainer trainer, Torwart torwart, ArrayList<Spieler> listOfSpieler) {
        this.name = name;
        this.trainer = trainer;
        this.torwart = torwart;
        this.listOfSpieler = listOfSpieler;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Torwart getTorwart() {
        return torwart;
    }

    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }

    public ArrayList<Spieler> getListOfSpieler() {
        return listOfSpieler;
    }

    public void setListOfSpieler(ArrayList<Spieler> listOfSpieler) {
        this.listOfSpieler = listOfSpieler;
    }

    public double getMotivation() {
        double totalMotivation = 0;
        for (Spieler spieler : this.listOfSpieler) {
            totalMotivation += spieler.getMotivation();
        }
        return totalMotivation / this.listOfSpieler.size();
    }

    public double getStrength() {
        double totalStrength = 0;
        for (Spieler spieler : this.listOfSpieler) {
            totalStrength += spieler.getStrength();
        }
        return totalStrength / this.listOfSpieler.size();
    }
}
