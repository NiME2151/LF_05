package ab.strukturierte_programmierung.schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Fakultaet {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Bitte geben Sie die Länge der Fakultäts-Berechnung ein: ");
        int n = Integer.parseInt(bufferedReader.readLine());
        int faculty = 1;

        System.out.println(1);
        for (int i = 1; i <= n; i++) {
            System.out.println((faculty *= i));
        }
    }
}
