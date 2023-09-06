package lf_05.ab.strukturierte_programmierung.arrays.temperaturauswertungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class TemperaturHelper {

    private double[] dailyCelsiusTemperatures;

    private double highestTemp;
    private double smallestTemp;
    private double range;
    private double maxDifference;

    DecimalFormat decimalFormat = new DecimalFormat("#.00");
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private void determineArraySizeByUserInput() throws IOException {
        System.out.print("Wie viele Tage wollen Sie untersuchen? ");
        int arrayLength = Integer.parseInt(bufferedReader.readLine());
        dailyCelsiusTemperatures = new double[arrayLength];
    }

    private void fillArrayWithUserInput() throws IOException {
        for (int index = 0; index < dailyCelsiusTemperatures.length; index++) {
            System.out.print("Bitte geben Sie die Temperatur an Tag " + (index+1) + " ein: ");
            dailyCelsiusTemperatures[index] = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
        }
    }

    private void calculateAverageTemperature() {
        double sum = 0;
        for (double val : dailyCelsiusTemperatures) {
            sum += val;
        }
        double average = sum / dailyCelsiusTemperatures.length;
        System.out.println("Mittelwert\t\t\t: " + decimalFormat.format(average));
    }

    private void getHighestTemperature() {
        highestTemp = 0;
        for (double val : dailyCelsiusTemperatures) {
            if (val > highestTemp) {
                highestTemp = val;
            }
        }
        System.out.println("Maximale Temperatur : " + decimalFormat.format(highestTemp));
    }

    private void getSmallestTemperature() {
        smallestTemp = highestTemp;
        for (double val : dailyCelsiusTemperatures) {
            if (val < smallestTemp) {
                smallestTemp = val;
            }
        }
        System.out.println("Minimale Temperatur : " + decimalFormat.format(smallestTemp));
    }

    private void calculateRange() {
        range = highestTemp - smallestTemp;
        System.out.println("Spannweite\t\t\t: " + decimalFormat.format(range));
    }

    private void calculateMaxDifference() {
        double previousVal = dailyCelsiusTemperatures[0];
        double maxDifference = 0;
        for (int index = 1; index < dailyCelsiusTemperatures.length; index++) {
            if ((dailyCelsiusTemperatures[index] - previousVal) > maxDifference) {
                maxDifference = dailyCelsiusTemperatures[index] - previousVal;
            }
            previousVal = dailyCelsiusTemperatures[index];
        }
        System.out.println("Maximale Differenz\t: " + decimalFormat.format(maxDifference));
    }

    public void printRelevantTemperatureCalculations() throws IOException {
        determineArraySizeByUserInput();
        fillArrayWithUserInput();
        calculateAverageTemperature();
        getHighestTemperature();
        getSmallestTemperature();
        calculateRange();
        calculateMaxDifference();
    }
}
