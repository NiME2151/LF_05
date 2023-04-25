package ab.strukturierte_programmierung.refactoring.schritt6;

class CommandQuit implements ICommand {

    @Override
    public void execute() {
        System.out.println("Danke f�r dieses Spiel. Auf Wiedersehen.");
    }
}
