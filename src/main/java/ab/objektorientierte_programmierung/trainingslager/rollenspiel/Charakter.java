package ab.objektorientierte_programmierung.trainingslager.rollenspiel;

abstract class Charakter {

    private String name;
    private int stamina;

    public Charakter(String name, int stamina) {
        this.name = name;
        this.stamina = stamina;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStamina() {
        return stamina;
    }

    protected void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public String walk() throws TooExhaustedException {
        if (this.stamina < 1) {
            throw new TooExhaustedException("walk", this.name);
        }
        else {
            this.stamina -= 1;
            return this.name + " walks, which costs them 1 stamina.";
        }
    }

    public String climb() throws TooExhaustedException {
        if (this.stamina < 2) {
            throw new TooExhaustedException("climb", this.name);
        }
        else {
            this.stamina -= 2;
            return this.name + " climbs, which costs them 2 stamina.";
        }
    }

    public String fight() {
        if (this.stamina < 3) {
            return this.name + " cannot fight, they are too exhausted.";
        }
        else {
            this.stamina -= 3;
            return this.name + " fights, which costs them 3 stamina.";
        }
    }

    public String eat() {
        this.stamina += 10;
        return this.name + " eats something, which restores 10 stamina.";
    }
}
