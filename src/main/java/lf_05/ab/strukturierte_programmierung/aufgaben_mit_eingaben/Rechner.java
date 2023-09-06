package lf_05.ab.strukturierte_programmierung.aufgaben_mit_eingaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Rechner {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double num1, num2;
        System.out.println("Bitte geben Sie die erste Zahl für die Rechnungen ein: ");
        num1 = Double.parseDouble(bufferedReader.readLine());
        System.out.println("Bitte geben Sie nun die zweite Zahl ein: ");
        num2 = Double.parseDouble(bufferedReader.readLine());

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " hoch " + num2 + " = " + (Math.pow(num1, num2)));
    }
}
