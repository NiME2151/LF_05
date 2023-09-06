package lf_05.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatter {

    public static String format(String toBeFormatted, String pattern, Locale locale) {
        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(locale);
        df.applyPattern(pattern);
        return df.format(toBeFormatted);
    }

    public static <Type> String format(Type toBeFormatted, String pattern, Locale locale) {
        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(locale);
        df.applyPattern(pattern);
        return df.format(toBeFormatted);
    }

    public static String formatToGermanNumber(String toBeFormatted, int decimalPlace) {
        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(Locale.GERMAN);
        df.applyPattern("#." + "#".repeat(decimalPlace));
        return df.format(toBeFormatted);
    }

    public static <Type> String formatToGermanNumber(Type toBeFormatted, int decimalPlace) {
        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(Locale.GERMAN);
        df.applyPattern("#." + "#".repeat(decimalPlace));
        return df.format(toBeFormatted);
    }

    public static String formatToCurrency(String toBeFormatted, Locale locale) {
        return NumberFormat.getCurrencyInstance(locale).format(Double.parseDouble(toBeFormatted));
    }

    public static <Type> String formatToCurrency(Type toBeFormatted, Locale locale) {
        return NumberFormat.getCurrencyInstance(locale).format(toBeFormatted);
    }
}
