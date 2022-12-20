package ab.strukturierte_programmierung.verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Locale;

class Bestellung {

    public static void main(String[] args) throws IOException {
        int screwCounter = 0, nutsCounter = 0, washersCounter = 0;
        double totalPrice = 0;
        boolean isOrderCorrect = false;
        String pattern = "#,##0.00";
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.GERMAN);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.print("Bitte geben Sie ein wie viele Schrauben Sie bestellen möchten: ");
            screwCounter = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Bitte geben Sie ein wie viele Muttern Sie bestellen möchten: ");
            nutsCounter = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Bitte geben Sie ein wie viele Unterlegscheiben Sie bestellen möchten: ");
            washersCounter = Integer.parseInt(bufferedReader.readLine());
            totalPrice = (screwCounter + 0.05) + (nutsCounter * 0.03) + (washersCounter * 0.01);
            if (screwCounter == nutsCounter) {
                isOrderCorrect = true;
            }
            else {
                System.out.println("Ihre Bestellung ist inkorrekt, da die Anzahl an Schrauben und Muttern gleich zu sein hat.");
            }
        } while (!isOrderCorrect);
        System.out.println("Bestellung erfolgreich erstellt");
        System.out.println(
                "Rechnung:\n" +
                screwCounter + "x Schrauben\n" +
                nutsCounter + "x Muttern\n" +
                washersCounter + "x Unterlegscheiben\n\n" +
                "Gesamtpreis (in EUR): " + numberFormat.format(totalPrice) + " €"
        );
    }
}
