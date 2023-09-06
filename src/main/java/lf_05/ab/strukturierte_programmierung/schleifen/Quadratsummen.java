package lf_05.ab.strukturierte_programmierung.schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Quadratsummen {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Geben Sie an wie viele Quadratzahlen Sie berechnen möchten: ");
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i <= n; i++) {
            System.out.println(Math.pow(i, 2));
        }
    }
}
