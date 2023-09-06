package lf_05.ab.strukturierte_programmierung.verzweigungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BMI {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int height = 0, weight = 0;
        double bmi = 0;
        System.out.print("Bitte geben Sie Ihre Körpergröße (in cm) ein: ");
        height = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Bitte geben Sie nun Ihr Körpergewicht  (in kg) ein: ");
        weight = Integer.parseInt(bufferedReader.readLine());
        bmi = weight / Math.pow((height/100.0), 2);
        System.out.print("Ihr BMI: ");
        System.out.printf("%.1f", bmi);
        System.out.println();
        if (bmi < 20) {
            System.out.println("Sie sind untergewichtig");
        }
        else if (bmi < 25) {
            System.out.println("Sie haben Normalgewicht");
        }
        else if (bmi < 30) {
            System.out.println("Sie haben Übergewicht");
        }
        else if (bmi < 40) {
            System.out.println("Sie sind Adipositas");
        }
        else if (bmi >= 40) {
            System.out.println("Sie habe starke Adipositas");
        }
    }
}
