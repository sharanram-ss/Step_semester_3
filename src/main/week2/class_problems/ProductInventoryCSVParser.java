package week2.class_problems;

import java.util.Scanner;

public class ProductInventoryCSVParser {

    static void parseInventoryRecord(String csvLine) {

        String[] parts = csvLine.split(",");

        if (parts.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String productName = parts[0];
        String sku = parts[1];
        String quantity = parts[2];

        System.out.println("Product: " + productName + " | SKU: " + sku + " | Qty: " + quantity);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product record: ");
        String csvLine = sc.nextLine();

        parseInventoryRecord(csvLine);

        sc.close();
    }
}