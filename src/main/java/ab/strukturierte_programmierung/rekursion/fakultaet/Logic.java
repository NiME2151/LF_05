package ab.strukturierte_programmierung.rekursion.fakultaet;

import java.io.IOException;

import static util.IO.readInt;

class Logic {

    private int n;
    private int faculty = 1;

    public void determineFacultyLengthByUserInput() throws IOException {
        System.out.print("Bitte geben Sie die Länge der zu berechnenden Fakultät an: ");
        this.n = readInt();
    }

    public void calculateFacultyWithForLoop() {
        for (int i = 1; i <= this.n; i++) {
            this.faculty *= i;
        }
    }

    public void calculateFacultyWithRecursion(int i) {
        this.faculty *= i;
        i++;
        if (i >= this.n) {
            calculateFacultyWithRecursion(i);
        }
    }

    public void printFaculty() {
        System.out.println("Die Fakultät von " + this.n + " beträgt: " + this.faculty);
    }

    public void run() throws IOException {
        determineFacultyLengthByUserInput();
        calculateFacultyWithForLoop();
        printFaculty();
        calculateFacultyWithRecursion(1);
        printFaculty();
    }
}