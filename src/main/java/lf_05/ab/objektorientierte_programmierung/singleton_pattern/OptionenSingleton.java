package lf_05.ab.objektorientierte_programmierung.singleton_pattern;

class OptionenSingleton {

    private static OptionenSingleton instance;
    private String saveLocation;

    private OptionenSingleton() {

    }

    public static OptionenSingleton getInstance() {
        if (instance == null) {
            instance = new OptionenSingleton();
            return instance;
        }
        return instance;
    }

    public String getSaveLocation() {
        return saveLocation;
    }

    public void setSaveLocation(String saveLocation) {
        this.saveLocation = saveLocation;
    }
}
