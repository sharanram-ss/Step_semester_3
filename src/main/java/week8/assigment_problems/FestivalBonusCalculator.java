package week8.assigment_problems;

import java.util.Scanner;

public class FestivalBonusCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double totalBonus = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();

            double bonus;

            if (type.equals("FULLTIME")) {
                bonus = salary * 0.10;
            } else if (type.equals("PARTTIME")) {
                bonus = salary * 0.05;
            } else {
                bonus = 2000;
            }

            System.out.printf("%s: %.2f%n", name, bonus);
            totalBonus = totalBonus + bonus;
        }

        System.out.printf("Total Bonus: %.2f%n", totalBonus);

        sc.close();
    }
}