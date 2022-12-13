package ab.rekursion.palindrom;

import java.io.IOException;

import static java.lang.Character.toLowerCase;
import static util.IO.readString;

class Logic {

    private String word;
    private int wordLength;
    private int counter = 0;

    public void determineWordToBeCheckedByUserInput() throws IOException {
        System.out.println("Palindromüberprüfer");
        System.out.print("Bitte geben Sie das Wort ein, welches überprüft werden soll: ");
        this.word = readString();
        this.wordLength = this.word.length();
    }

    public void checkWordThroughLoop() {
        this.counter = 0;
        for (int i = 0; i < this.wordLength; i++) {
            if (toLowerCase(this.word.charAt(i)) == toLowerCase(this.word.charAt(this.wordLength-1-i))) {
                this.counter++;
            }
        }
    }

    public void checkWordThroughRecursion(int i) {
        if (toLowerCase(this.word.charAt(i)) == toLowerCase(this.word.charAt(this.wordLength-1-i))) {
            this.counter++;
        }
        i++;
        if (i <= wordLength-1) {
            checkWordThroughRecursion(i);
        }
    }

    public void printResult() {
        if (this.counter == this.word.length()) {
            System.out.println("Das Wort '" + this.word + "' ist ein Palindrom.");
        }
        else {
            System.out.println("Das Wort '" + this.word + "' ist kein Palindrom.");
        }
    }

    public void run() throws IOException {
        determineWordToBeCheckedByUserInput();
        checkWordThroughLoop();
        printResult();
        this.counter = 0;
        checkWordThroughRecursion(0);
        printResult();
    }
}
