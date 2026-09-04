package week3.class_problems;

import java.util.Scanner;

public class PrimeNumber {

    static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Is the number " + number + " a Prime number? " + isPrime(number));

        sc.close();
    }
}