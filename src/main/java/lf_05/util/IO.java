package lf_05.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO {

    private static final BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));

    public static int readInt() throws IOException {
        return Integer.parseInt(BUFFERED_READER.readLine());
    }

    public static double readDouble() throws IOException {
        return Double.parseDouble(BUFFERED_READER.readLine());
    }

    public static String readString() throws IOException {
        return String.valueOf(BUFFERED_READER.readLine());
    }

    public static char readChar() throws IOException {
        return String.valueOf(BUFFERED_READER.readLine()).charAt(0);
    }
}
