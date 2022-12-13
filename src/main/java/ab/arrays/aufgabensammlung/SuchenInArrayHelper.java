package ab.arrays.aufgabensammlung;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SuchenInArrayHelper {

    private double[] arr = new double[5];
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private void setArrayValuesByUserInput() throws IOException {
        System.out.println("Bitte geben Sie ein Array bestehend aus fünf Kommazahlen ein.");

        for (int index = 0; index < arr.length; index++) {
            System.out.print("Wert " + (index+1) + " eingeben: ");
            arr[index] = Double.parseDouble(bufferedReader.readLine());
        }
    }

    public void printHitOrPrivetForSearchedNumber() throws IOException {
        setArrayValuesByUserInput();

        System.out.print("Nach welcher Zahl wollen Sie suchen? ");
        double searchedNumber = Double.parseDouble(bufferedReader.readLine());

        for (double val : arr) {
            if (val == searchedNumber) {
                System.out.println("Treffer");
            } else {
                System.out.println("Niete");
            }
        }
    }
}
