package ab.arrays.aufgabensammlung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MaximaHelper {

    private double[] array;

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private void determineArraySizeByUserInput() throws IOException {
        System.out.print("Wie lang soll Ihr Array sein: ");
        int arrayLength = Integer.parseInt(bufferedReader.readLine());
        array = new double[arrayLength];
    }

    private void fillArrayByUserInput() throws IOException {
        for (int index = 0; index < array.length; index++) {
            System.out.print("Wert " + (index+1) + " eingeben: ");
            array[index] = Double.parseDouble(bufferedReader.readLine());
        }
    }

    public void getBiggestAndSecondBiggestNumberInArray() throws IOException {
        determineArraySizeByUserInput();
        fillArrayByUserInput();

        double biggestNumber = 0;
        double secondBiggestNumber = 0;
        for (double val : array) {
            if (val > biggestNumber) {
                biggestNumber = val;
            }
        }
        for (double val : array) {
            if (val < biggestNumber && val > secondBiggestNumber) {
                secondBiggestNumber = val;
            }
        }
        System.out.println("Größte Zahl: " + biggestNumber);
        System.out.println("Zweitgrößte Zahl: " + secondBiggestNumber);
    }
}
