package lf_05.ab.strukturierte_programmierung.arrays.lagerbestand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class LagerbestandHelper {

    private final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private final DecimalFormat decimalFormat = new DecimalFormat("#.##");

    private LagerbestandArtikel[] articles;
    private int totalQuantity = 0;
    private double totalPrice = 0.0;
    private double[] totalPricesOfArticles;

    private void determineArraySizeByUserInput() throws IOException {
        System.out.print("Wie viele unterschiedliche Artikel haben Sie im Lager? ");
        int arrayLength = Integer.parseInt(bufferedReader.readLine());
        articles = new LagerbestandArtikel[arrayLength];
    }

    private void setNameOfArticles() throws IOException {
        System.out.println("Erfassen Sie die einzelnen Artikelbeizeichnungen:");
        for (int index = 0; index < articles.length; index++) {
            articles[index] = new LagerbestandArtikel();
            System.out.print("Artikel '" + (index+1) + "': ");
            articles[index].setName(bufferedReader.readLine());
        }
    }

    private void setPriceOfArticles() throws IOException {
        System.out.println("Erfassen Sie jetzt den Einzelpreis jedes Artikels:");
        for (LagerbestandArtikel article : articles) {
            System.out.print("Preis des Artikels '" + article.getName() + "': ");
            article.setPrice(Double.parseDouble(bufferedReader.readLine().replace(',', '.')));
        }
    }

    private void setQuantityOfArticles() throws IOException {
        System.out.println("Erfassen Sie jetzt die Anzahl der einzelnen Artikel:");
        for (LagerbestandArtikel article : articles) {
            System.out.print("Menge des Artikels '" + article.getName() + "': ");
            article.setQuantity(Integer.parseInt(bufferedReader.readLine()));
        }
    }

    private void calculateTotalQuantityOfAllArticles() {
        for (LagerbestandArtikel article : articles) {
            totalQuantity += article.getQuantity();
        }
    }

    private void calculateTotalPriceOfAllArticles() {
        totalPricesOfArticles = new double[articles.length];
        for (int index = 0; index < articles.length; index++) {
            totalPricesOfArticles[index] += articles[index].getPrice() * articles[index].getQuantity();
        }
        for (double articleTotalPrice : totalPricesOfArticles) {
            totalPrice += articleTotalPrice;
        }
    }

    private void callHelperMethods() throws IOException {
        determineArraySizeByUserInput();
        setNameOfArticles();
        setPriceOfArticles();
        setQuantityOfArticles();
        calculateTotalQuantityOfAllArticles();
        calculateTotalPriceOfAllArticles();
    }

    public void printTotalQuantityAndTotalPrice() throws IOException {
        callHelperMethods();
        System.out.println("In Ihrem Lager befinden sich insgesamt " + totalQuantity + " Artikel im Wert von " + decimalFormat.format(totalPrice) + " €");
    }
}
