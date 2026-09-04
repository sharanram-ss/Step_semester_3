package week2.assigment_problems;

import java.util.Scanner;

public class WordReversalEncoder {

    static String reverseEachWord(String sentence) {

        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {

            String reverse = "";

            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverse = reverse + words[i].charAt(j);
            }

            result = result + reverse + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.println("Encoded sentence: " + reverseEachWord(sentence));

        sc.close();
    }
}