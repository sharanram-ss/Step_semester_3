package week3.class_problems;

import java.util.Scanner;

public class PalindromeNumber {

    static boolean isPalindrome(int number) {

        int original = number;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        return original == reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Is the number " + number + " a Palindrome? " + isPalindrome(number));

        sc.close();
    }
}