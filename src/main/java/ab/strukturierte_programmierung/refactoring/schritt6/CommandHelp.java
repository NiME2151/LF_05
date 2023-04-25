package ab.strukturierte_programmierung.refactoring.schritt6;

class CommandHelp implements ICommand {

    @Override
    public void execute() {
        System.out.println("Du irrst in Nogard herum.");
        System.out.println("Dir stehen folgende Befehle zur Verf�gung:");
        System.out.println("\tgo");
        System.out.println("\tquit");
        System.out.println("\thelp");
        System.out.println("\ttake");
        System.out.println("\tput");
        System.out.println("\teat");
        System.out.println("\tinfo");
    }
}
