package ab.aufgaben_mit_eingaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Benutzer {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstName, surname, sex;

        System.out.println("Bitte geben Sie Ihren Vornamen ein: ");
        firstName = bufferedReader.readLine();
        System.out.println("Geben Sie nun Ihren Nachnamen ein: ");
        surname = bufferedReader.readLine();
        System.out.println("Geben Sie nun Ihr Geschlecht (m, w oder d) ein: ");
        sex = bufferedReader.readLine();

        switch (sex) {
            case "m" -> {
                System.out.print("Hallo Herr ");
            }
            case "w" -> {
                System.out.print("Hallo Frau ");
            }
            case "d" ->  {
                System.out.print("Hallo Person ");
            }
            default -> System.out.println("Es gab einen Fehler bei Ihrer Eingabe.");
        }
        System.out.println(firstName + " " + surname + "!");
    }
}
