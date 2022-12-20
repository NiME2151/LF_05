package ab.strukturierte_programmierung.sparvertrag;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class Sparvertrag {

    public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            DecimalFormat df = new DecimalFormat("#.00");
            String doAgain = "";
            double capitalOfYear = 0, interestIncome = 0, capitalAtEndOfYear = 0;
        do {
            System.out.print("Geben Sie Bitte das Startkapital ein: ");
            double seedCapital = Double.parseDouble(bufferedReader.readLine());
            System.out.print("Geben Sie Bitte den Zinssatz ein: ");
            double interestRate = Double.parseDouble(bufferedReader.readLine());
            System.out.print("Geben Sie Bitte die Laufzeit ein: ");
            double runningTimeInYears = Double.parseDouble(bufferedReader.readLine());

            capitalOfYear = seedCapital;
            System.out.println("Jahr\t\tAnfangskapital\t\tZinsbetrag\t\tJahresendbetrag");
            for (int year = 1; year <= runningTimeInYears; year++) {
                interestIncome = capitalOfYear *  (interestRate / 100);
                capitalAtEndOfYear = capitalOfYear + interestIncome;
                System.out.println(year + "\t\t\t" + df.format(capitalOfYear) + "\t\t\t\t" + df.format(interestIncome) + "\t\t\t" + df.format(capitalAtEndOfYear));
                capitalOfYear = capitalAtEndOfYear;
            }
            System.out.print("Weiteren Sparvertrag berechnen (Ja oder Nein)? ");
            doAgain = bufferedReader.readLine();
        } while (doAgain.equals("Ja"));
    }
}
