package lf_05.ab.strukturierte_programmierung.verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Alterspruefung {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Bitte geben Sie Ihr Alter ein: ");
        int age = Integer.parseInt(bufferedReader.readLine());
        if (age < 18) {
            System.out.println("Du bist noch minderjährig!");
        }
        else if (age >= 18) {
            System.out.println("Du bist schon volljährig!");
        }
        else {
            System.out.println("Es ist ein Fehler aufgetreten");
        }
    }
}
