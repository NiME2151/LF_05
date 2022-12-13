package util_testing;

import util.NicoMath;
import util.NumberFormatter;

import java.util.Locale;

class Test {

    public static void main(String[] args) {

        System.out.println(NumberFormatter.formatToCurrency("2.0", Locale.GERMANY)); // 2,00 €
        System.out.println(NumberFormatter.format(3.146, "#.##", Locale.GERMANY)); // 3,15
        System.out.println(NumberFormatter.formatToGermanNumber(2.3435, 3)); // 2,344
        System.out.println(NicoMath.charToInt('5') == 5); // true
        for (int i = 0; i < 50; i++) {
            System.out.print(NicoMath.randomInt(-1, 2) + ", ");
        }
    }
}
