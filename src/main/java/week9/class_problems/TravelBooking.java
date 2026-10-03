package week9.class_problems;

import java.util.Scanner;

abstract class Travel {
    protected double distance;

    private static final double BOOKING_FEE = 50;

    public Travel(double distance) {
        this.distance = distance;
    }

    abstract double calculateFare();

    public double calculateTotal() {
        return calculateFare() + BOOKING_FEE;
    }
}

class Bus extends Travel {

    public Bus(double distance) {
        super(distance);
    }

    public double calculateFare() {
        return distance * 2;
    }
}

class Train extends Travel {

    public Train(double distance) {
        super(distance);
    }

    public double calculateFare() {
        return distance * 1.5;
    }
}

class Flight extends Travel {

    public Flight(double distance) {
        super(distance);
    }

    public double calculateFare() {
        return 2500 + (distance * 4);
    }
}

public class TravelBooking {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String mode = sc.next();
            double distance = sc.nextDouble();

            Travel travel;

            if (mode.equals("BUS")) {
                travel = new Bus(distance);
            } else if (mode.equals("TRAIN")) {
                travel = new Train(distance);
            } else {
                travel = new Flight(distance);
            }

            double total = travel.calculateTotal();

            System.out.printf("%s: %.2f%n", mode, total);
        }

        sc.close();
    }
}