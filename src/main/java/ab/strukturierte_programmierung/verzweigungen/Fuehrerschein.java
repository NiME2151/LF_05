package ab.strukturierte_programmierung.verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Fuehrerschein {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Bitte geben Sie Ihr Alter ein: ");
        int age = Integer.parseInt(bufferedReader.readLine());

        if (age < 14) {
            System.out.println("Du darfst Bobby-Car und Fahrrad fahren.");
        }
        else if (age <= 16) {
            System.out.println("Du darfst schon 50er fahren.");
        }
        else if (age < 18) {
            System.out.println("Du darfst schon 125er fahren, aber noch kein Auto.");
        }
        else if (age >= 18) {
            System.out.println("Du darfst jetzt auch Auto fahren.");
        }
        else {
            System.out.println("Es ist ein Fehler aufgetreten.");
        }
    }
}
