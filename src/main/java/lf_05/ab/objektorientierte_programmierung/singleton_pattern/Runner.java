package lf_05.ab.objektorientierte_programmierung.singleton_pattern;

class Runner {

    public static void main(String[] args) {

        String path = "fakePath";
        OptionenSingleton options = OptionenSingleton.getInstance();
        System.out.println(OptionenSingleton.getInstance().getSaveLocation());
        options.setSaveLocation(path);
        System.out.println(OptionenSingleton.getInstance().getSaveLocation());
    }
}
