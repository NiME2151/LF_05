package lf_05.ab.strukturierte_programmierung.observer_pattern;

class CommandWasserMarsch implements ICommand {

    @Override
    public void execute() {
        System.out.println("Wasser marsch!");
    }
}
