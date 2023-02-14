package ab.objektorientierte_programmierung.trainingslager.rollenspiel;

class Elf extends Charakter {

    Elf(String name, int stamina) {
        super(name, stamina);
    }

    public String run() throws TooExhaustedException {
        if (this.getStamina() < 2) {
            throw new TooExhaustedException("run", this.getName());
        }
        else {
            this.setStamina(this.getStamina() - 2);
            return this.getName() + " runs, which costs them 2 stamina.";
        }
    }
}
