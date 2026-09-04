package week2.assigment_problems;

import java.util.Scanner;

public class LibraryISBNNormalizerValidator {

    static String normalizeCode(String raw) {
        raw = raw.trim();

        String firstThree = raw.substring(0, 3).toUpperCase();
        String rest = raw.substring(3);

        return firstThree + rest;
    }

    static String validateAndFormat(String code) {

        if (code.length() != 13) {
            return "Invalid: wrong length";
        }

        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: non-letter publisher code";
            }
        }

        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: non-digit body";
            }
        }

        String publisher = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7);

        return "[" + publisher + "] YEAR: " + year
                + " | CATALOG: " + catalog;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ISBN code: ");
        String raw = sc.nextLine();

        String code = normalizeCode(raw);

        System.out.println(validateAndFormat(code));

        sc.close();
    }
}