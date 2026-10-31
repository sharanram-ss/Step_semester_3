package week11.class_problems;

import java.util.*;

public class PairSumSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int target = sc.nextInt();

        int left = 0, right = n - 1;
        boolean found = false;

        while (left < right) {
            int sum = a[left] + a[right];

            if (sum == target) {
                System.out.println("(" + a[left] + ", " + a[right] + ")");
                found = true;
                break;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        if (!found)
            System.out.println("Not Found");
    }
}