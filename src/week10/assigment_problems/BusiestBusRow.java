package week10.assigment_problems;

import java.util.Scanner;

public class BusiestBusRow {

    public static int[] busiestRow(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int maxTotal = -1;
        int rowIndex = 0;

        for (int i = 0; i < rows; i++) {

            int total = 0;

            for (int j = 0; j < cols; j++) {
                total = total + grid[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                rowIndex = i;
            }
        }

        return new int[]{rowIndex, maxTotal};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] grid = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int[] result = busiestRow(grid);

        System.out.println("Row: " + result[0]);
        System.out.println("Total: " + result[1]);

        sc.close();
    }
}