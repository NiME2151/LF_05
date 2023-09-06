package lf_05.ab.strukturierte_programmierung.spielwiese;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class LottoHelper {

    private int[] lotteryBalls = new int[6];
    private int superNumber;

    private int getRandomIntegerBetween(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }

    private void drawNumbersWithPossibleDoubles() {
        for (int index = 0; index < 6; index++) {
            lotteryBalls[index] = getRandomIntegerBetween(1, 49);
        }
    }

    private void drawNumbersWithoutDoubles() {
        boolean isNumberAvailable;
        for (int index = 0; index < 6; index++) {
            isNumberAvailable = false;
            do {
                int randomNumber = getRandomIntegerBetween(1, 49);
                if (IntStream.of(lotteryBalls).noneMatch(ball -> ball == randomNumber)) {
                    lotteryBalls[index] = randomNumber;
                    isNumberAvailable = true;
                }
            } while (!isNumberAvailable);
        }
    }
    private void drawSuperNumber() {
        superNumber = getRandomIntegerBetween(1, 49);
    }

    public void printLotteryNumbersWithPossibleDoubles(boolean allowDoubles) {
        if (allowDoubles) {
            drawNumbersWithPossibleDoubles();
        }
        else {
            drawNumbersWithoutDoubles();
        }
        drawSuperNumber();
        lotteryBalls = Arrays.stream(lotteryBalls).sorted().toArray();
        System.out.print("Lottozahlen: ");
        for (int ball : lotteryBalls) {
            System.out.print(ball + " ");
        }
        System.out.println("\nZusatzzahl: " + superNumber);
    }
}
