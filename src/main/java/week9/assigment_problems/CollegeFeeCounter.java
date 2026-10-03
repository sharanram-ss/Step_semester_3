package week9.assigment_problems;

import java.util.Scanner;

abstract class Student {
    protected String name;

    private static final double TRANSPORT_FEE = 12000;

    public Student(String name) {
        this.name = name;
    }

    abstract double calculateTuition();

    public double getTransportFee() {
        return 0;
    }

    public double getTotalFee() {
        return calculateTuition() + getTransportFee();
    }
}

interface BusUser {
    double getTransportFee();
}

class DayScholar extends Student implements BusUser {
    public DayScholar(String name) {
        super(name);
    }

    public double calculateTuition() {
        return 40000;
    }

    public double getTransportFee() {
        return 12000;
    }
}

class Hosteller extends Student {
    public Hosteller(String name) {
        super(name);
    }

    public double calculateTuition() {
        return 40000 + 60000;
    }
}

class Scholar extends Student implements BusUser {
    public Scholar(String name) {
        super(name);
    }

    public double calculateTuition() {
        return 20000;
    }

    public double getTransportFee() {
        return 12000;
    }
}

public class CollegeFeeCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();

            Student student;

            if (type.equals("DAY_SCHOLAR")) {
                student = new DayScholar(name);
            } else if (type.equals("HOSTELLER")) {
                student = new Hosteller(name);
            } else {
                student = new Scholar(name);
            }

            double fee = student.getTotalFee();

            System.out.printf("%s: %.2f%n", name, fee);
            total = total + fee;
        }

        System.out.printf("Total Collected: %.2f%n", total);

        sc.close();
    }
}