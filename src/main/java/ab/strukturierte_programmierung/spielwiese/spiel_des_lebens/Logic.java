package ab.strukturierte_programmierung.spielwiese.spiel_des_lebens;

import util.IO;
import util.NicoMath;

import java.io.IOException;

class Logic {

    private String[][] gameFieldOfLastRound;
    private String[][] gameField;
    private static final String ALIVE_TOKEN = "A";
    private static final String DEAD_TOKEN = "D";

    private static final String ALIVE_COLOR = "\u001b[32m";
    private static final String DEAD_COLOR = "\u001b[31m";

    private static final String DEFAULT_COLOR = "\u001b[0m";

    private void determineGameFieldSizeByUserInput() throws IOException {
        System.out.print("Wie breit soll das Spielfeld sein? ");
        int width = IO.readInt();
        System.out.print("Wie hoch soll das Spielfield sein? ");
        int height = IO.readInt();
        gameField = new String[height][width];
    }

    private void populateGameFieldWithLifeByUserInput() throws IOException {
        System.out.println("Bestimmen Sie bitte die Felder, auf denen Leben sein soll. Geben Sie dafür beim Feld '" + ALIVE_TOKEN + "' ein.");
        for (int y = 0; y < this.gameField.length; y++) {
            for (int x = 0; x < this.gameField[y].length; x++) {
                System.out.print("Feld [" + (y+1) + ", " + (x+1) + "]: ");
                if (IO.readString().equalsIgnoreCase(ALIVE_TOKEN)) {
                    this.gameField[y][x] = ALIVE_TOKEN;
                }
                else {
                    this.gameField[y][x] = DEAD_TOKEN;
                }
            }
        }
    }

    private void populateGameFieldWithLife() {
        for (int row = 0; row < this.gameField.length; row++) {
            for (int column = 0; column < this.gameField[row].length; column++) {
                if (NicoMath.randomInt(0, 1) == 1) {
                    this.gameField[row][column] = ALIVE_TOKEN;
                }
                else {
                    this.gameField[row][column] = DEAD_TOKEN;
                }
            }
        }
    }

    private int checkNeighbors(String[][] arr, int x, int y) {
        int neighborCounter = 0;
        if ((y+1) < arr.length) {
            if (arr[y+1][x].equalsIgnoreCase(ALIVE_TOKEN)) {
                neighborCounter++;
            }
        }
        if (arr[y].length > x+1) {
            if (arr[y][x+1].equalsIgnoreCase(ALIVE_TOKEN)) {
                neighborCounter++;
            }
        }
        if (y > 0) {
            if (arr[y-1][x].equalsIgnoreCase(ALIVE_TOKEN)) {
                neighborCounter++;
            }
        }
        if (x != 0) {
            if (arr[y][x-1].equalsIgnoreCase(ALIVE_TOKEN)) {
                neighborCounter++;
            }
        }
        return neighborCounter;
    }

    private void updateField() {
        for (int y = 0; y < this.gameField.length; y++) {
            for (int x = 0; x < this.gameField[y].length; x++) {
                int neighborCount = checkNeighbors(this.gameFieldOfLastRound, x, y);
                if (this.gameField[y][x].equalsIgnoreCase(ALIVE_TOKEN)) {
                    if (neighborCount == 2 || neighborCount == 3) {
                        this.gameField[y][x] = ALIVE_TOKEN;
                    }
                    else if (neighborCount < 2) {
                        this.gameField[y][x] = DEAD_TOKEN;
                    }
                    else {
                        this.gameField[y][x] = DEAD_TOKEN;
                    }
                }
                else {
                    if (neighborCount == 3) {
                        this.gameField[y][x] = ALIVE_TOKEN;
                    }
                }
            }
        }
        this.gameFieldOfLastRound = this.gameField;
    }

    private void printGameField() {
        for (String[] row : this.gameField) {
            for (String columnInRow : row) {
                if (columnInRow.equalsIgnoreCase(ALIVE_TOKEN)) {
                    System.out.print(ALIVE_COLOR + columnInRow);
                }
                else {
                    System.out.print(DEAD_COLOR + columnInRow);
                }
                System.out.print(DEFAULT_COLOR + "\t");
            }
            System.out.println();
        }
    }

    private void showOptions() {
        System.out.println("Optionen:");
        System.out.println("- Zufällige Platzierung der lebenden Felder [1]");
        System.out.println("- Manuelle Platzierung der lebenden Feler [2]");
        System.out.println("- Spiel beenden [3]");
    }

    private void getSelectedOptionByUserInput() throws IOException {
        System.out.print("Eingabe: ");
        switch (IO.readInt()) {
            case 1 -> {
                populateGameFieldWithLife();
            }
            case 2 -> {
                populateGameFieldWithLifeByUserInput();
            }
            default -> System.out.println("Spiel wird beendet");
        }
    }

    private void gameLoop() throws IOException {
        determineGameFieldSizeByUserInput();
        showOptions();
        getSelectedOptionByUserInput();
        printGameField();
        runRoundLoop();
    }

    private boolean isThereLife() {
        boolean isThereLife = false;
        for (String[] row : this.gameField) {
            for (String columnInRow : row) {
                if (columnInRow.equalsIgnoreCase(ALIVE_TOKEN)) {
                    isThereLife = true;
                    break;
                }
            }
        }
        return isThereLife;
    }

    private void runRoundLoop() throws IOException {
        boolean isGameOver = false;
        do {
            System.out.print("Wollen Sie eine weitere Runde simulieren (Y) oder das Spiel beenden (N)? ");
            String answer = IO.readString();
            if (answer.equalsIgnoreCase("Y")) {
                this.gameFieldOfLastRound = this.gameField;
                updateField();
                printGameField();
                if (!isThereLife()) {
                    System.out.println("Es gibt kein Leben mehr und es kann auch kein neues entstehen. Das Spiel des Lebens hat sein Ende gefunden.");
                    isGameOver = true;
                }
            }
            else if (answer.equalsIgnoreCase("N")) {
                isGameOver = true;
                System.out.println("Spiel wird beendet");
            }
            else {
                System.out.println("Ihre Eingabe ist nicht gültig. Versuchen Sie es erneut.");
            }
        } while (!isGameOver);
    }

    public void runGame() throws IOException {
        gameLoop();
    }
}
