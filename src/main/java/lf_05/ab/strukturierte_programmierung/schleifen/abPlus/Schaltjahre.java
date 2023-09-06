package lf_05.ab.strukturierte_programmierung.schleifen.abPlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Schaltjahre {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String doAgain = "";
        do {
            System.out.print("Bei welchem Jahr soll Ihre Berechnung beginnen: ");
            int startYear = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Bis zu welchem Jahr soll Ihre Berechnung gehen: ");
            int endYear = Integer.parseInt(bufferedReader.readLine());

            for (int year = startYear; year <= endYear; year++) {
                if (year % 4 == 0 || year % 400 == 0) {
                    System.out.println(year);
                }
            }

            System.out.print("Wollen Sie weitere Schaltjahre berechnen (J oder N): ");
            doAgain = bufferedReader.readLine();
        } while (doAgain.equalsIgnoreCase("J"));
    }
}
