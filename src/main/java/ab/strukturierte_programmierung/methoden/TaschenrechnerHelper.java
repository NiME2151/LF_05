package ab.strukturierte_programmierung.methoden;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TaschenrechnerHelper {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    void calculate() throws IOException {
        String operationSelector = determineOperationSelector();
        switch (operationSelector) {
            case "+", "-", "*", "/" -> {
                calculateBasicArithmetics(operationSelector);
            }
            case "p" -> {
                calculateExponentiation();
            }
            case "w" -> {
                calculateSqrt();
            }
            default -> System.out.println("Es ist ein Fehler aufgetreten!");
        }
    }

    private String determineOperationSelector() throws IOException {
        System.out.println("Folgende Rechenoperationen stehen zur Auswahl: ");
        System.out.println("[+] für Addition");
        System.out.println("[-] für Subtraktion");
        System.out.println("[*] für Multiplikation");
        System.out.println("[/] für Division");
        System.out.println("[p] für Potenzieren");
        System.out.println("[w] für Wurzel");
        System.out.print("Deine Auswahl: ");
        return bufferedReader.readLine();
    }

    private void calculateBasicArithmetics(String operationSelector) throws IOException {
        System.out.print("Bitte geben Sie die erste Zahl ein: ");
        double n1 = Double.parseDouble(bufferedReader.readLine());

        System.out.print("Bitte geben Sie die zweite Zahl ein: ");
        double n2 = Double.parseDouble(bufferedReader.readLine());

        double sum = n1 + n2;
        double difference = n1 - n2;
        double product = n1 * n2;
        double quotient = n1 / n2;

        System.out.println("Zahl 1: " + n1);
        System.out.println("Zahl 2: " + n2);

        switch (operationSelector) {
            case "+" -> System.out.println("Summe: " + sum);
            case "-" -> System.out.println("Differenz: " + difference);
            case "*" -> System.out.println("Produkt: " + product);
            case "/" -> System.out.println("Quotient: " + quotient);
            default -> System.out.println("Es gab einen Fehler!");
        }
    }

    private void calculateExponentiation() throws IOException {
        System.out.print("Bitte geben Sie die Basis ein: ");
        double base = Double.parseDouble(bufferedReader.readLine());

        System.out.print("Bitte geben Sie den Exponenten ein: ");
        double exponent = Double.parseDouble(bufferedReader.readLine());

        double exponentiation = Math.pow(base, exponent);

        System.out.println(base + " hoch " + exponent + " = " + exponentiation);
    }

    private void calculateSqrt() throws IOException {
        System.out.print("Bitte geben Sie die Zahl ein aus der Sie die Wurzel ziehen möchten: ");
        double radicand = Double.parseDouble(bufferedReader.readLine());

        double sqrt = Math.sqrt(radicand);

        System.out.println("Die Wurzel aus " + radicand + " lautet: " + sqrt);
    }

    boolean doesUserWantAnotherCalculation() throws IOException {
        System.out.print("Wollen Sie eine weitere Rechnung durchführen? (j oder n) ");
        String doAgainSelector = bufferedReader.readLine();
        if (doAgainSelector.equalsIgnoreCase("n")) {
            return false;
        }
        else if (!doAgainSelector.equalsIgnoreCase("j")) {
            System.out.println("Fehler. Programm wird abgebrochen");
            return false;
        }
        return true;
    }
}
