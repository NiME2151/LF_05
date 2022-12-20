package ab.strukturierte_programmierung.zweidimensionale_arrays.kino;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class KinoHelper {

    String[][] hall;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private void determineHallSizeByUserInput() throws IOException {
        System.out.print("Wie viele Reihen soll der Kinosaal haben? ");
        int rowSize = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Wie viele Size pro Reihe soll der Kinosaal haben? ");
        int columnSize = Integer.parseInt(bufferedReader.readLine());
        this.hall = new String[rowSize][columnSize];
    }

    private void fillHallWithEmptySeats() {
        for (String[] row : this.hall) {
            Arrays.fill(row, "O");
        }
    }

    private void showHall() {
        System.out.println("Die aktuelle Sitzplatzverteilung (O = Frei, X = Belegt):");
        for (String[] row : this.hall) {
            for (String seatInRow : row) {
                System.out.print(seatInRow + " ");
            }
            System.out.println();
        }
    }

    private void reserveSeat() throws IOException {
        boolean isSeatFree = false;
        do {
            System.out.print("In welcher Reihe wollen Sie einen Sitz reservieren? ");
            int row = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Welchen Platz in der Reihe " + (row+1) + " möchten Sie reservieren? ");
            int column = Integer.parseInt(bufferedReader.readLine());
            if (this.hall[row-1][column-1].equalsIgnoreCase("O")) {
                this.hall[row-1][column-1] = "X";
                isSeatFree = true;
            }
            else {
                System.out.println("Dieser Platz ist bereits belegt. Bitte wählen Sie einen anderen Platz aus.");
            }
        } while (!isSeatFree);
        showHall();
    }

    private void cancelSeatReservation() throws IOException {
        boolean isSeatReserved = false;
        do {
            System.out.print("In welcher Reihe wollen Sie einen Sitz stornieren? ");
            int row = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Welchen Platz in der Reihe " + (row + 1) + " möchten Sie stornieren? ");
            int column = Integer.parseInt(bufferedReader.readLine());
            if (this.hall[row-1][column-1].equalsIgnoreCase("X")) {
                this.hall[row-1][column-1] = "O";
                isSeatReserved = true;
            } else {
                System.out.println("Dieser Platz ist noch nicht belegt. Bitte wählen Sie einen anderen Platz aus.");
            }
        } while (!isSeatReserved);
        showHall();
    }

    private void showAvailableOptions() throws IOException {
        boolean isProgramFinished = false;
        do {
            System.out.println("Ihnen stehen folgende Optionen zur Verfügung:");
            System.out.println("- Kinosaal-Plätze anzeigen [1]");
            System.out.println("- Platz reservieren [2]");
            System.out.println("- Platz stornieren [3]");
            System.out.println("- Programm beenden [4]");
            System.out.print("Wählen geben Sie die entsprechende Zahl ein, um eine Option auszuwhälen: ");
            int selectedOption = Integer.parseInt(bufferedReader.readLine());
            switch (selectedOption) {
                case 1 -> {
                    showHall();
                }
                case 2 -> {
                    reserveSeat();
                }
                case 3 -> {
                    cancelSeatReservation();
                }
                case 4 -> {
                    isProgramFinished = true;
                }
                default -> System.out.println("Es gab einen Fehler!");
            }
        } while (!isProgramFinished);
    }

    public void executeProgram() throws IOException {
        determineHallSizeByUserInput();
        fillHallWithEmptySeats();
        showAvailableOptions();
    }
}
