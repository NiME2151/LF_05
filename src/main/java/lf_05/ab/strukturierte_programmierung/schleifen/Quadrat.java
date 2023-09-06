package lf_05.ab.strukturierte_programmierung.schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Quadrat {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Wie groß soll Ihr Quadrat sein: ");
        int n = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n-1) {
                for (int j = 0; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else {
                System.out.print("*");
                for (int k = 1; k < n; k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
