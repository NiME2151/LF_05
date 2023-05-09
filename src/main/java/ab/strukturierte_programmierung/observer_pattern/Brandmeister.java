package ab.strukturierte_programmierung.observer_pattern;

import java.util.ArrayList;
import java.util.List;

class Brandmeister {

    private List<IObserver> befehlsEmpfaengerListe = new ArrayList<>();

    public void addObserver(IObserver observer) {
        this.befehlsEmpfaengerListe.add(observer);
    }

    public void removeObserver(IObserver observer) {
        this.befehlsEmpfaengerListe.remove(observer);
    }

    public void work() {
        notifyObserver();
    }

    private void notifyObserver() {
        this.befehlsEmpfaengerListe.forEach(observer -> observer.notify(new CommandWasserMarsch()));
    }
}