package ab.schleifen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Wurzel {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int startNum = 0, endNum = 0;
        System.out.print("Bitte geben Sie den Anfangswert ein: ");
        startNum = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Geben Sie nun bitte Ihren Endwert ein: ");
        endNum = Integer.parseInt(bufferedReader.readLine());

        for (int i = startNum; i < endNum; i++) {
            System.out.println("n: " + i);
            System.out.println("Wurzel aus n: " + Math.sqrt(i));
        }
    }
}
