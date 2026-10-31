package week11.assigment_problems;

import java.util.*;

public class DiceThrowTally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        int count[] = new int[7];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            count[a[i]]++;
        }

        System.out.print("Counts: ");

        for (int i = 1; i <= 6; i++)
            System.out.print(i + ":" + count[i] + " ");

        int k = 0;

        for (int i = 1; i <= 6; i++) {
            for (int j = 0; j < count[i]; j++) {
                a[k] = i;
                k++;
            }
        }

        System.out.println();
        System.out.println("Sorted: " + Arrays.toString(a));
    }
}