package week9.class_problems;

import java.util.Scanner;

abstract class LibraryItem {
    protected String title;
    protected int daysLate;

    public LibraryItem(String title, int daysLate) {
        this.title = title;
        this.daysLate = daysLate;
    }

    abstract double calculateFine();
}

class Book extends LibraryItem {

    public Book(String title, int daysLate) {
        super(title, daysLate);
    }

    public double calculateFine() {
        return daysLate * 2;
    }
}

class DVD extends LibraryItem {

    public DVD(String title, int daysLate) {
        super(title, daysLate);
    }

    public double calculateFine() {
        double fine = daysLate * 5;

        if (fine > 50) {
            fine = 50;
        }

        return fine;
    }
}

class Magazine extends LibraryItem {

    public Magazine(String title, int daysLate) {
        super(title, daysLate);
    }

    public double calculateFine() {
        return daysLate;
    }
}

public class LibraryLateFineCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String title = sc.next();
            int daysLate = sc.nextInt();

            LibraryItem item;

            if (type.equals("BOOK")) {
                item = new Book(title, daysLate);
            } else if (type.equals("DVD")) {
                item = new DVD(title, daysLate);
            } else {
                item = new Magazine(title, daysLate);
            }

            double fine = item.calculateFine();

            System.out.printf("%s: %.2f%n", title, fine);
            total = total + fine;
        }

        System.out.printf("Total Fines: %.2f%n", total);

        sc.close();
    }
}