package lf_05.ab.strukturierte_programmierung.aufgaben_mit_eingaben;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Zeugnis {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader  = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> grades = new ArrayList<>();

        double sumOfGrades = 0;
        System.out.println("Bitte geben Sie Ihre Deutsch-Note ein: ");
        grades.add(Integer.parseInt(bufferedReader.readLine()));
        System.out.println("Bitte geben Sie nun Ihre Mathe-Note ein: ");
        grades.add(Integer.parseInt(bufferedReader.readLine()));
        System.out.println("Bitte geben Sie nun Ihre Englisch-Note ein: ");
        grades.add(Integer.parseInt(bufferedReader.readLine()));

        for (int grade : grades) {
            sumOfGrades += grade;
        }
        System.out.println("Ihre Durchschnittsnote beträgt: " + (sumOfGrades / grades.size()));
    }
}
