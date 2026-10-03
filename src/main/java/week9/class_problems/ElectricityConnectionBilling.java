package week9.class_problems;

import java.util.Scanner;

abstract class Connection {
    protected int units;

    public Connection(int units) {
        this.units = units;
    }

    abstract double calculateBill();
}

class Home extends Connection {

    public Home(int units) {
        super(units);
    }

    public double calculateBill() {
        if (units <= 100) {
            return units * 5;
        } else {
            return (100 * 5) + ((units - 100) * 7);
        }
    }
}

class Shop extends Connection {

    public Shop(int units) {
        super(units);
    }

    public double calculateBill() {
        return (units * 8) + 100;
    }
}

class Factory extends Connection {

    public Factory(int units) {
        super(units);
    }

    public double calculateBill() {
        double bill = units * 6;

        if (bill < 1000) {
            bill = 1000;
        }

        return bill;
    }
}

public class ElectricityConnectionBilling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int units = sc.nextInt();

            Connection connection;

            if (type.equals("HOME")) {
                connection = new Home(units);
            } else if (type.equals("SHOP")) {
                connection = new Shop(units);
            } else {
                connection = new Factory(units);
            }

            double bill = connection.calculateBill();

            System.out.printf("%s: %.2f%n", type, bill);
            total = total + bill;
        }

        System.out.printf("Total: %.2f%n", total);

        sc.close();
    }
}