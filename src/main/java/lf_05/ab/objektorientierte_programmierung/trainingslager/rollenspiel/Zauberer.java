package lf_05.ab.objektorientierte_programmierung.trainingslager.rollenspiel;

class Zauberer extends Charakter {

    private int mana;

    Zauberer(String name, int stamina, int mana) {
        super(name, stamina);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String castSpell() throws TooExhaustedException {
        if (this.mana < 1) {
            throw new TooExhaustedException("cast a spell", this.getName());
        }
        else {
            this.mana -= 1;
            return this.getName() + " casts a spell, which costs them 1 mana.";
        }
    }

    public String drinkManaPotion() {
        this.mana += 3;
        return this.getName() + " is drinking a mana potion, which restores 3 mana.";
    }
}
