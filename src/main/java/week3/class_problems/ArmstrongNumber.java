package week3.class_problems;

import java.util.Scanner;

public class ArmstrongNumber {

    static boolean isArmstrong(int number) {

        int origNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum = sum + digit * digit * digit;
            number = number / 10;
        }

        return sum == origNumber;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Is the number " + number
                + " an Armstrong number? " + isArmstrong(number));

        sc.close();
    }
}