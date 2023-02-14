package ab.objektorientierte_programmierung.fussball;

public class SpielAbbruchException extends Exception {

    final int playtime;

    public SpielAbbruchException(int playtime) {
        super();
        this.playtime = playtime;
    }

    public int getPlaytime() {
        return playtime;
    }

    @Override
    public String getMessage() {
        return "The game was cancelled at minute " + this.playtime + " due to an unexpected event";
    }
}
