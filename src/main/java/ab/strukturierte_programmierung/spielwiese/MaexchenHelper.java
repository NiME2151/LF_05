package ab.strukturierte_programmierung.spielwiese;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class MaexchenHelper {

    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private int diceEyeCountOne = 0;
    private int diceEyeCountTwo = 0;

    private void throwDices() {
        Random r = new Random();
        diceEyeCountOne = r.nextInt(6-1) + 1;
        diceEyeCountTwo = r.nextInt(6-1) + 1;
    }

    public void checkEyeCountAndPrintResult() {
        throwDices();
        int points = 0;
        if ((diceEyeCountOne == 1 && diceEyeCountTwo == 2) || (diceEyeCountTwo == 1 && diceEyeCountOne == 2)) {
            points = 1000;
            System.out.println("Du hast ein Mäxchen geworfen, du erhältst " + points + " Punkte.");
        }
        else if (diceEyeCountOne == diceEyeCountTwo) {
            points = diceEyeCountOne * 100;
            System.out.println("Du hast einen Pasch geworfen, du erhältst " + points + " Punkte.");
        }
        else {
            if (diceEyeCountOne > diceEyeCountTwo) {
                points = (diceEyeCountOne * 10) + diceEyeCountTwo;
            }
            else {
                points = (diceEyeCountTwo * 10) + diceEyeCountOne;
            }
            System.out.println("Du hast einen normalen Wurf geworfen, du erhältst " + points + " Punkte.");
        }
    }
}
