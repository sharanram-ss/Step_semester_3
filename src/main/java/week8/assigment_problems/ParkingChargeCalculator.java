package week8.assigment_problems;

import java.util.Scanner;

public class ParkingChargeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int hours = sc.nextInt();

            double charge;

            if (type.equals("BIKE")) {
                charge = hours * 10;
            } else if (type.equals("CAR")) {
                charge = 30 + (hours - 1) * 20;
            } else {
                charge = hours * 50;

                if (charge < 100) {
                    charge = 100;
                }
            }

            System.out.printf("%s: %.2f%n", type, charge);
            total = total + charge;
        }

        System.out.printf("Total: %.2f%n", total);

        sc.close();
    }
}