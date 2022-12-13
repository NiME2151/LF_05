package ab.arrays.aufgabensammlung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BalkendiagrammHelper {

    private double[] candidateScores;

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private void determineCandidateCountByUserInput() throws IOException {
        System.out.print("Wie viele Kandidaten sind nich im Rennen? ");
        int candidateCount = Integer.parseInt(bufferedReader.readLine());
        candidateScores = new double[candidateCount];
    }

    private void fillArrayWithUserInputs() throws IOException {
        for (int index = 0; index < candidateScores.length; index++) {
            System.out.print("Kandidat " + (index+1) + " eingeben: ");
            candidateScores[index] = Double.parseDouble(bufferedReader.readLine());
        }
    }

    public void printBarGraphOfCandidateScores() throws IOException {
        determineCandidateCountByUserInput();
        fillArrayWithUserInputs();

        System.out.println("Ergebnis: ");
        for (int index = 0; index < candidateScores.length; index++) {
            System.out.print("Kandidat " + (index+1) + ": ");
            for (int i = 0; i < candidateScores[index]; i++) {
                System.out.print("*");
            }
            System.out.println(" " + candidateScores[index] + "%");
        }
    }
}
