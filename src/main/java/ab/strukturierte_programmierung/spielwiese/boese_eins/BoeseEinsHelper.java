package ab.strukturierte_programmierung.spielwiese.boese_eins;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

class BoeseEinsHelper {

    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private ArrayList<Player> players = new ArrayList<>();
    private int currentPlayer = 1;
    private int pointsToEndGame = 0;
    private boolean anotherGame = false;

    private void determinePlayerCountByUserInput() throws IOException {
        System.out.print("Wie viele Spieler wollen spielen? ");
        int playerCount = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < playerCount; i++) {
            players.add(new Player());
        }
    }

    public void gameLoop() throws IOException {
        determinePlayerCountByUserInput();
        int eyeCount = 0;
        do {
            System.out.println("Spieler " + currentPlayer + " ist an der Reihe.");
            gameRoundLoop(eyeCount);
        } while (!anotherGame);
    }

    private void gameRoundLoop(int eyeCount) throws IOException {
        int pointsThisRound; // Punkte müssen noch richtig errechnet werden
        boolean isRoundOver = false;
            do {
                int currentThrow = throwDice();
                System.out.println("Spieler " + currentPlayer + " würfelt eine: " + currentThrow);
                if (currentThrow == 1) {
                    pointsThisRound = 0;
                    chooseNextPlayer();
                    isRoundOver = true;
                }
                else if (eyeCount >= 11) {
                    boolean isInputCorrect = false;
                    do {
                        System.out.println("Spieler " + currentPlayer + " hat mindestens eine Augenssumme von 11 erreicht.");
                        System.out.print("Willst du weiterspielen (Ja oder Nein)? ");
                        String answer = bufferedReader.readLine();
                        if (answer.equalsIgnoreCase("Nein")) {
                            isRoundOver = true;
                            isInputCorrect = true;
                        }
                        else if (!answer.equalsIgnoreCase("Ja")) {
                            System.out.println("Inkorrekte Eingabe! Bitte versuchen Sie es erneut.");
                        }
                    } while (!isInputCorrect);
                }
                players.get(currentPlayer-1).setPoints(eyeCount += currentThrow);
                System.out.println("Spieler " + currentPlayer + " hat nun insgesamt " + players.get(currentPlayer-1).getPoints() + " Punkte ");
            } while (!isRoundOver);
    }

    private void chooseNextPlayer() {
        if (currentPlayer == players.size()) {
            currentPlayer = 1;
        }
        else {
            currentPlayer++;
        }
    }

    private int throwDice() {
        Random r = new Random();
        return r.nextInt(6-1) + 1;
    }
}
