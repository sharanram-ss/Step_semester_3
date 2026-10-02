package week8.assigment_problems;

import java.time.LocalDate;
import java.util.Scanner;

public class StreamingPlanRenewalReminder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String plan = sc.next();
            String name = sc.next();
            String date = sc.next();

            LocalDate startDate = LocalDate.parse(date);
            int days;

            if (plan.equals("BASIC")) {
                days = 30;
            } else if (plan.equals("STANDARD")) {
                days = 90;
            } else {
                days = 365;
            }

            LocalDate renewalDate = startDate.plusDays(days);

            System.out.println(name + ": " + renewalDate);
        }

        sc.close();
    }
}