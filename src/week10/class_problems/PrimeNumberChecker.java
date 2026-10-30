package week10.assigment_problems;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean prime = true;

        if (num <= 1) {
            prime = false;
        } else {

            for (int i = 2; i <= num / 2; i++) {

                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        if (prime) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }

        sc.close();
    }
}