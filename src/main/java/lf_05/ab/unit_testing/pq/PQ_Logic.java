package lf_05.ab.unit_testing.pq;

import java.io.IOException;

import static lf_05.util.IO.readDouble;
import static lf_05.util.NumberFormatter.formatToGermanNumber;

public class PQ_Logic {

    private double p;
    private double q;

    private double discriminant;

    private double[] results;

    private void setPAndQbyUserInput() throws IOException {
        System.out.print("Geben Sie P ein: ");
        this.p = readDouble();
        System.out.print("Geben Sie Q ein: ");
        this.q = readDouble();
    }

    private int checkHowManySolutions() {
        if (this.discriminant > 0) {
            System.out.println("Die Berechnung ergab, dass es zwei Lösungen für diese Eingaben gibt.");
            return 2;
        }
        else if (this.discriminant == 0) {
            System.out.println("Die Berechnung ergab, dass es nur eine Lösung für diese Eingaben gibt.");
            return 1;
        }
        else if (this.discriminant < 0) {
            System.out.println("Die Berechnung ergab, dass es keine Lösung für diese Eingaben gibt.");
            return 0;
        }
        return -1;
    }

    public double[] calculatePQ(double p, double q) {
        this.discriminant = Math.pow((p / 2), 2) - q;
        double head = (p * -1) / 2;
        double tail = Math.sqrt(this.discriminant);
        int solutionCount = checkHowManySolutions();
        if (solutionCount == 2) {
            this.results = new double[2];
            this.results[0] = head + tail;
            this.results[1] = head - tail;
        }
        else if (solutionCount == 1) {
            this.results = new double[1];
            this.results[0] = head + tail;
        }
        else {
            return new double[0];
        }
        return this.results;
    }

    private void printX1AndX2() {
        System.out.println("Diskriminante D = " + formatToGermanNumber(this.discriminant, 3));
        int solutionCount = checkHowManySolutions();
        if (solutionCount == 2) {
            System.out.println("x1 = " + formatToGermanNumber(this.results[0], 3));
            System.out.println("x2 = " + formatToGermanNumber(this.results[1], 3));
        }
        else if (solutionCount == 1) {
            System.out.println("x1,2 = " + formatToGermanNumber(this.results[0], 3));
        }
        else if (solutionCount == -1) {
            System.out.println("Es gab einen Fehler.");
        }
    }

    public void run() throws IOException {
        System.out.println("PQ-Formel-Rechner");
        setPAndQbyUserInput();
        calculatePQ(this.p, this.q);
        printX1AndX2();
    }
}
