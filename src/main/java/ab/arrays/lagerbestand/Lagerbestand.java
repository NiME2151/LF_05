package ab.arrays.lagerbestand;

import java.io.IOException;

class Lagerbestand {

    public static void main(String[] args) throws IOException {
        LagerbestandHelper lagerbestandHelper = new LagerbestandHelper();
        lagerbestandHelper.printTotalQuantityAndTotalPrice();
    }
}
