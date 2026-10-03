package week9.class_problems;

import java.util.Scanner;

abstract class Staff {
    protected String name;

    public Staff(String name) {
        this.name = name;
    }

    abstract double calculatePay();
}

class FullTime extends Staff {
    private double salary;

    public FullTime(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double calculatePay() {
        return salary;
    }
}

class Hourly extends Staff {
    private double hours;
    private double rate;

    public Hourly(String name, double hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    public double calculatePay() {
        if (hours <= 40) {
            return hours * rate;
        } else {
            return (40 * rate) + ((hours - 40) * rate * 1.5);
        }
    }
}

class Intern extends Staff {
    private double stipend;

    public Intern(String name, double stipend) {
        super(name);
        this.stipend = stipend;
    }

    public double calculatePay() {
        return stipend;
    }
}

public class WeeklyStaffPay {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();

            Staff staff;

            if (type.equals("FULLTIME")) {
                double salary = sc.nextDouble();
                staff = new FullTime(name, salary);
            } else if (type.equals("HOURLY")) {
                double hours = sc.nextDouble();
                double rate = sc.nextDouble();
                staff = new Hourly(name, hours, rate);
            } else {
                double stipend = sc.nextDouble();
                staff = new Intern(name, stipend);
            }

            double pay = staff.calculatePay();

            System.out.printf("%s: %.2f%n", name, pay);
            total = total + pay;
        }

        System.out.printf("Total Payroll: %.2f%n", total);

        sc.close();
    }
}