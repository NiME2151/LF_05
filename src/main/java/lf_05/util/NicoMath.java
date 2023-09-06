package lf_05.util;

import java.util.Random;

public class NicoMath {

    public static int randomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static int charToInt(char character) {
        return Integer.parseInt(String.valueOf(character));
    }
}
