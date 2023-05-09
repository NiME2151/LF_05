package ab.strukturierte_programmierung.observer_pattern;

class Programm {

    public static void main(String[] args) {
        doWork();
    }

    public static void doWork() {
        Brandmeister brandmeister = new Brandmeister();
        Feuerwehrmann feuerwehrmann1 = new Feuerwehrmann("Nico", "Meyer");
        Feuerwehrmann feuerwehrmann2 = new Feuerwehrmann("Tim", "Meyer");
        brandmeister.addObserver(feuerwehrmann1);
        brandmeister.addObserver(feuerwehrmann2);
        brandmeister.work();
    }
}
