package ab.verzweigungen.abPlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Dreiecksungleichung {

    public static void main(String[] args) throws IOException {
        double a = 0, b = 0, c = 0, circumference = 0, surfaceArea = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Geben Sie die Länge der Seite A an: ");
        a = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Geben Sie die Länge der Seite B an: ");
        b = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Geben Sie die Länge der Seite C an: ");
        c = Integer.parseInt(bufferedReader.readLine());

        circumference = a + b + c;
//        surfaceArea = 0.5 *

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Es ist möglich mit Ihren Werten ein Dreieck zu bilden.");
            System.out.print("Umfang des Dreiecks: " + circumference + "\n");
            System.out.print("Flächeninhalt des Dreiecks: " + surfaceArea + "\n");
        }
        else {
            System.out.println("Es ist nicht möglich mit Ihren Eingaben ein Dreieck zu bilden.");
        }
    }
}
