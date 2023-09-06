package lf_05.ab.strukturierte_programmierung.schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GeometrischeReihe {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Calculator calculator = new Calculator();
        System.out.print("Bitte geben Sie ein wie lang Ihre Geometrische Reihe sein soll: ");
        int n = Integer.parseInt(bufferedReader.readLine());
        calculator.calculateGeometricSeries(n);
    }
}

class Calculator {
      void calculateGeometricSeries(int n) {
          double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1 / Math.pow(2, i);
        }
        System.out.println(sum);
    }
}
