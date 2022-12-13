package ab.rekursion.fibonacci;

import java.io.IOException;
import java.util.Arrays;

import static util.IO.readInt;

class Logic {

    private int n;
    private int[] fibonacciSequence;
    private boolean isTooBig;

    public void determineLengthOfFibonacciSequence() throws IOException {
        System.out.print("Wie lang soll die Fibonacci-Folge sein? ");
        this.n = readInt();
        this.fibonacciSequence = new int[n+1];
    }

    public void calculateFibonacciSequenceThroughLoop() {
        int n1 = 0;
        int n2 = 1;
        this.fibonacciSequence[0] = n1;
        this.fibonacciSequence[1] = n2;

        for (int i = 2; i <= n; i++) {
            if ((n1 + n2) < 0) {
                isTooBig = true;
                this.fibonacciSequence = Arrays.stream(this.fibonacciSequence)
                        .skip(0)
                        .filter(number -> number != 0)
                        .toArray();
                break;
            }
            else {
                this.fibonacciSequence[i] = n1 + n2;
                n1 = n2;
                n2 = this.fibonacciSequence[i];
            }
        }
    }

    public void calculateFibonacciSequenceThroughRecursion(int n1, int n2, int i) {
        if ((n1 + n2) < 0) {
            isTooBig = true;
            this.fibonacciSequence = Arrays.stream(this.fibonacciSequence)
                    .skip(0)
                    .filter(number -> number != 0)
                    .toArray();
        }
        else {
            this.fibonacciSequence[i] = n1 + n2;
            n1 = n2;
            n2 = this.fibonacciSequence[i];
        }
        i++;
        if (i >= n) {
            calculateFibonacciSequenceThroughRecursion(n1, n2, i);
        }
    }

    public void printFibonacciSequence() {
        Arrays.stream(this.fibonacciSequence).forEach(number -> {
            System.out.print(number + " ");
        });
        System.out.println();
        if (isTooBig) {
            System.out.println("Die Fibonacci-Folge wurde vorzeitig beendet, da die kommenden Zahlen zu groß werden.");
        }
    }

    public void run() throws IOException {
        determineLengthOfFibonacciSequence();
        calculateFibonacciSequenceThroughLoop();
        printFibonacciSequence();
        calculateFibonacciSequenceThroughRecursion(0, 1, 2);
        printFibonacciSequence();
    }
}
