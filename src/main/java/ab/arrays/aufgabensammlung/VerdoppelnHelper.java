package ab.arrays.aufgabensammlung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class VerdoppelnHelper {

    private double[] originalArray;
    private double[] doubledArray;

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private void determineArraySizeByUserInput() throws IOException {
        System.out.println("Bitte geben Sie ein Array aus Kommazahlen ein.");
        System.out.print("Wie viele Werte? ");
        int arrayLength = Integer.parseInt(bufferedReader.readLine());
        originalArray = new double[arrayLength];
        doubledArray = new double[arrayLength];
    }

    private void getOriginalArrayValuesByUserInput() throws IOException {
        for (int index = 0; index < originalArray.length; index++) {
            System.out.print("Wert " + (index+1) + " eingeben: ");
            originalArray[index] = Double.parseDouble(bufferedReader.readLine());
        }
    }

    private void doubleOriginalArray() {
        for (int index = 0; index < originalArray.length; index++) {
            doubledArray[index] = originalArray[index] * 2;
        }
    }

    public void printOriginalAndDoubledArray() throws IOException {
        determineArraySizeByUserInput();
        getOriginalArrayValuesByUserInput();
        doubleOriginalArray();

        System.out.println("Ursprüngliches Array: ");
        for (double val : originalArray) {
            System.out.print(val + "\t\t");
        }
        System.out.println();

        System.out.println("Verdoppeltes Array: ");
        for (double val : doubledArray) {
            System.out.print(val + "\t\t");
        }
    }
}
