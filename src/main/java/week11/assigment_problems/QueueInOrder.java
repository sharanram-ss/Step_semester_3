package week11.assigment_problems;

import java.util.*;

public class QueueInOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int result = -1;

        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}