package ab.zweidimensionale_arrays.lieferbeziehungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class LieferungenHelper {

    int[][] januaryMatrix, februaryMatrix, sumMatrix;
    int[] rowSumMatrix, columnSumMatrix;

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private void determineMatricesSizes() throws IOException {
        int rowSize = 0, columnSize = 0;
        System.out.print("Wie viele Artikel sollen die Tabellen jeweils beinhalten? ");
        rowSize = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Wie viele Kunden sollen die Tabelle jeweils einhalten? ");
        columnSize = Integer.parseInt(bufferedReader.readLine());
        this.januaryMatrix = new int[rowSize][columnSize];
        this.februaryMatrix = new int[rowSize][columnSize];
        this.sumMatrix = new int[rowSize][columnSize];
        this.rowSumMatrix = new int[rowSize];
        this.columnSumMatrix = new int[columnSize];
    }

    private void fillMatricesWithUserInputs() throws IOException {
        System.out.println("Tabelle für Januar:");
        for (int row = 0; row < this.januaryMatrix.length; row++) {
            for (int colum = 0; colum < this.januaryMatrix[row].length; colum++) {
                System.out.print("Lagerbestand für Artikel " + (row + 1) + " für Kunde " + (colum + 1) + ": ");
                this.januaryMatrix[row][colum] = Integer.parseInt(bufferedReader.readLine());
            }
            System.out.println();
        }
        System.out.println("Tabelle für Februar");
        for (int row = 0; row < this.februaryMatrix.length; row++) {
            for (int colum = 0; colum < this.februaryMatrix[row].length; colum++) {
                System.out.print("Lagerbestand für Artikel " + (row + 1) + " für Kunde " + (colum + 1) + ": ");
                this.februaryMatrix[row][colum] = Integer.parseInt(bufferedReader.readLine());
            }
            System.out.println();
        }
    }

    private void calcSumOfJanuaryAndFebruaryMatrix() {
        for (int row = 0; row < this.sumMatrix.length; row++) {
            for (int colum = 0; colum < this.sumMatrix[row].length; colum++) {
                this.sumMatrix[row][colum] = this.januaryMatrix[row][colum] + this.februaryMatrix[row][colum];
            }
        }
    }

    private void printSumMatrix() {
        System.out.println("Summenmatrix:");
        for (int row = 0; row < this.sumMatrix.length; row++) {
            System.out.print("Artikel " + (row+1) + " :");
            for (int colum = 0; colum < this.sumMatrix[row].length; colum++) {
                System.out.print(this.sumMatrix[row][colum] + "\t");
            }
            System.out.println();
        }
    }

    private void calcRowSumMatrix() {
        for (int row = 0; row < this.sumMatrix.length; row++) {
            for (int colum = 0; colum < this.sumMatrix[row].length; colum++) {
                this.rowSumMatrix[row] += this.sumMatrix[row][colum];
            }
        }
    }

    private void calcColumnSumMatrix() {
        for (int row = 0; row < this.sumMatrix.length; row++) {
            for (int colum = 0; colum < this.sumMatrix[row].length; colum++) {
                this.columnSumMatrix[colum] += this.sumMatrix[row][colum];
            }
        }
    }

    private void printRowAndColumnSumMatrices() {
        for (int index = 0; index < this.rowSumMatrix.length; index++) {
            System.out.println("Zeilensumme " + (index+1) + ": " + this.rowSumMatrix[index]);
        }
        for (int index = 0; index < this.columnSumMatrix.length; index++) {
            System.out.println("Spaltensumme " + (index+1) + ": " + this.columnSumMatrix[index]);
        }
    }

    public void callHelperMethods() throws IOException {
        determineMatricesSizes();
        fillMatricesWithUserInputs();
        calcSumOfJanuaryAndFebruaryMatrix();
        printSumMatrix();
        calcRowSumMatrix();
        calcColumnSumMatrix();
        printRowAndColumnSumMatrices();
    }
}
