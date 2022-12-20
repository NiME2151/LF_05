package ab.strukturierte_programmierung.methoden;

import java.io.IOException;

class Taschenrechner {

    public static void main(String[] args) throws IOException {
        TaschenrechnerHelper taschenrechnerHelper = new TaschenrechnerHelper();
        do {
            taschenrechnerHelper.calculate();
        } while (taschenrechnerHelper.doesUserWantAnotherCalculation());
    }
}
