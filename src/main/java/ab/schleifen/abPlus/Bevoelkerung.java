package ab.schleifen.abPlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class Bevoelkerung {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df;
        String doAgain = "";
        double populationAtStartOfYear = 0, populationGrowth = 0, populationGrowthInTotalNumbers, populationAtEndOfYear = 0;
        do {
            System.out.print("Bitte die aktuelle Bevölkerungsgröße in Milliarden eingeben: ");
            Double startingPopulation = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
            System.out.print("Bitte den jährlichen Zuwachs in Prozent eingeben: ");
            populationGrowth = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
            System.out.print("Bitte die Laufzeit der Prognose in Jahren eingeben: ");
            int runtimeInYears = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Bitte die Anzahl der anzuzeigenden Nachkommastellen eingeben: ");
            double decimalPlaceLength = Double.parseDouble(bufferedReader.readLine());
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < decimalPlaceLength; i++) {
                stringBuilder.append("#");
            }
            df = new DecimalFormat("#." + stringBuilder);

            populationAtStartOfYear = startingPopulation;
            System.out.println("Jahr\t\tAnfangspopulation\t\tZuwachs\t\tEndpopulation");
            for (int year = 1; year <= runtimeInYears; year++) {
                populationGrowthInTotalNumbers = populationAtStartOfYear *  (populationGrowth / 100);
                populationAtEndOfYear = populationAtStartOfYear + populationGrowthInTotalNumbers;
                System.out.print(year + "\t\t\t" + df.format(populationAtStartOfYear) + "\t\t\t\t\t" + df.format(populationGrowthInTotalNumbers) + "\t\t" + df.format(populationAtEndOfYear));
                if ((startingPopulation * 1.2) < populationAtEndOfYear) {
                    System.out.print(" *");
                }
                System.out.println();
                populationAtStartOfYear = populationAtEndOfYear;
            }
            System.out.print("Weitere Bevölkerungsprognose berechnen (J oder N)? ");
            doAgain = bufferedReader.readLine();
        } while (doAgain.equalsIgnoreCase("J"));
    }
}
