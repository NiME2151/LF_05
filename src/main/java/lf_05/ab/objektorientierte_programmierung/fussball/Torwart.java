package lf_05.ab.objektorientierte_programmierung.fussball;

class Torwart extends Spieler {

    private int reaction;

    public Torwart(String name, int age, int strength, int motivation, int reaction) {
        super(name, age, strength, 0, motivation, 0);
        this.reaction = reaction;
    }

    public int getReaction() {
        return reaction;
    }

    public void setReaction(int reaction) {
        this.reaction = reaction;
    }

    @Override
    public String toString() {
        return "Torwart-" +
                super.toString() + "\n" +
                "Reaction: " + this.reaction;
    }
}
