package week8.class_problems;

import java.time.LocalDate;
import java.util.Scanner;

interface Library {
    LocalDate getDueDate(LocalDate currentDate);
}

class Book implements Library {
    public LocalDate getDueDate(LocalDate currentDate) {
        return currentDate.plusDays(14);
    }
}

class DVD implements Library {
    public LocalDate getDueDate(LocalDate currentDate) {
        return currentDate.plusDays(7);
    }
}

class Magazine implements Library {
    public LocalDate getDueDate(LocalDate currentDate) {
        return currentDate.plusDays(3);
    }
}

public class LibraryItem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LocalDate currentDate = LocalDate.of(2023, 10, 26);

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String title = sc.next();

            Library item;

            if (type.equals("BOOK")) {
                item = new Book();
            } else if (type.equals("DVD")) {
                item = new DVD();
            } else {
                item = new Magazine();
            }

            LocalDate dueDate = item.getDueDate(currentDate);

            System.out.println(title + ": " + dueDate);
        }

        sc.close();
    }
}