package ab.arrays.aufgabensammlung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class SummenHelper {

    private int[] array;
    private ArrayList<Integer> evenNumbers = new ArrayList<>();
    private ArrayList<Integer> oddNumbers = new ArrayList<>();

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private void determineArraySizeByUserInput() throws IOException {
        System.out.print("Wie lang soll Ihr Array sein: ");
        int arrayLength = Integer.parseInt(bufferedReader.readLine());
        array = new int[arrayLength];
    }

    private void fillArrayByUserInput() throws IOException {
        for (int index = 0; index < array.length; index++) {
            System.out.print("Wert " + (index+1) + " eingeben: ");
            array[index] = Integer.parseInt(bufferedReader.readLine());
        }
    }

    private void checkIfNumberIsEvenOrOdd() {
        for (int val : array) {
            if (val % 2 == 0) {
                evenNumbers.add(val);
            } else {
                oddNumbers.add(val);
            }
        }
    }

    private void printCounterAndSumOfEvenNumbers() {
        System.out.println("Gerade Zahlen:");
        int count = evenNumbers.size();
        int sum = 0;
        for (int val : evenNumbers) {
            sum += val;
        }
        System.out.println("Anzahl = " + count);
        System.out.println("Summe = " + sum);
    }

    private void printCounterAndSumOfOddNumbers() {
        System.out.println("Ungerade Zahlen:");
        int count = oddNumbers.size();
        int sum = 0;
        for (int val : oddNumbers) {
            sum += val;
        }
        System.out.println("Anzahl = " + count);
        System.out.println("Summe = " + sum);
    }

    public void printEvenAndOddNumbers() throws IOException {
        determineArraySizeByUserInput();
        fillArrayByUserInput();
        checkIfNumberIsEvenOrOdd();
        printCounterAndSumOfEvenNumbers();
        printCounterAndSumOfOddNumbers();
    }
}
