package week10.assigment_problems;

import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println(factorial);

        sc.close();
    }
}