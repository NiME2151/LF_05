package util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatter {

    public static String format(String toBeFormatted, String pattern, Locale locale) {
        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(locale);
        df.applyPattern(pattern);
        return df.format(toBeFormatted);
    }

    public static String format(double toBeFormatted, String pattern, Locale locale) {
        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(locale);
        df.applyPattern(pattern);
        return df.format(toBeFormatted);
    }

    public static String format(float toBeFormatted, String pattern, Locale locale) {
        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(locale);
        df.applyPattern(pattern);
        return df.format(toBeFormatted);
    }

    public static String formatToGermanNumber(String toBeFormatted, int decimalPlace) {
        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(Locale.GERMAN);
        df.applyPattern("#." + "#".repeat(decimalPlace));
        return df.format(toBeFormatted);
    }

    public static String formatToGermanNumber(double toBeFormatted, int decimalPlace) {
        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(Locale.GERMAN);
        df.applyPattern("#." + "#".repeat(decimalPlace));
        return df.format(toBeFormatted);
    }

    public static String formatToGermanNumber(float toBeFormatted, int decimalPlace) {
        DecimalFormat df = (DecimalFormat) NumberFormat.getNumberInstance(Locale.GERMAN);
        df.applyPattern("#." + "#".repeat(decimalPlace));
        return df.format(toBeFormatted);
    }

    public static String formatToCurrency(String toBeFormatted, Locale locale) {
        return NumberFormat.getCurrencyInstance(locale).format(Double.parseDouble(toBeFormatted));
    }

    public static String formatToCurrency(double toBeFormatted, Locale locale) {
        return NumberFormat.getCurrencyInstance(locale).format(toBeFormatted);
    }

    public static String formatToCurrency(int toBeFormatted, Locale locale) {
        return NumberFormat.getCurrencyInstance(locale).format(toBeFormatted);
    }

    public static String formatToCurrency(long toBeFormatted, Locale locale) {
        return NumberFormat.getCurrencyInstance(locale).format(toBeFormatted);
    }

    public static String formatToCurrency(float toBeFormatted, Locale locale) {
        return NumberFormat.getCurrencyInstance(locale).format(toBeFormatted);
    }
}
