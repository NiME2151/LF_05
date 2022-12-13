package unit_tests.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import util.IO;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static util.NumberFormatter.*;

public class UtilTests {

    @Test
    public void shouldReturnNumberWithGermanPunctuationWhenAngloNumberIsProvided() {
        // given
        double number = 2.5;
        int decimalPlace = 1;

        // when
        String result = formatToGermanNumber(number, decimalPlace);

        // then
        assertEquals("2,5", result);
    }

    @Test
    public void shouldReturnNumberFormattedToGermanFormat() {
        // given
        double number = 2.123;
        String pattern = "#.###";
        Locale locale = Locale.GERMANY;

        // when
        String result = format(number, pattern, locale);

        // then
        assertEquals("2,123", result);
    }

    @Test
    public void shouldReturn() {
        // given
        double number = 1.99;
        Locale locale = Locale.GERMANY;

        // when
        String result = formatToCurrency(number, locale);

        // then
        assertEquals("1,99 €", result);
    }
}
