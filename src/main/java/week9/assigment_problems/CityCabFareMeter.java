package week9.assigment_problems;

import java.util.Scanner;

abstract class Cab {
    protected double km;

    public Cab(double km) {
        this.km = km;
    }

    abstract double getRate();

    public double calculateFare() {
        double fare = km * getRate();

        if (fare < 100) {
            fare = 100;
        }

        return fare;
    }
}

interface NightService {
    boolean hasNightService();
}

class Mini extends Cab {
    public Mini(double km) {
        super(km);
    }

    public double getRate() {
        return 10;
    }
}

class Sedan extends Cab implements NightService {
    public Sedan(double km) {
        super(km);
    }

    public double getRate() {
        return 14;
    }

    public boolean hasNightService() {
        return true;
    }
}

class SUV extends Cab implements NightService {
    public SUV(double km) {
        super(km);
    }

    public double getRate() {
        return 18;
    }

    public boolean hasNightService() {
        return true;
    }
}

public class CityCabFareMeter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double km = sc.nextDouble();
            String time = sc.next();

            Cab cab;

            if (type.equals("MINI")) {
                cab = new Mini(km);
            } else if (type.equals("SEDAN")) {
                cab = new Sedan(km);
            } else {
                cab = new SUV(km);
            }

            if (time.equals("NIGHT") && !(cab instanceof NightService)) {
                System.out.println(type + ": night service not available");
                continue;
            }

            double fare = cab.calculateFare();

            if (time.equals("NIGHT")) {
                fare = fare * 1.20;
            }

            System.out.printf("%s: %.2f%n", type, fare);
            total = total + fare;
        }

        System.out.printf("Total: %.2f%n", total);

        sc.close();
    }
}