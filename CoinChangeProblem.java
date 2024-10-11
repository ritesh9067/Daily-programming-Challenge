package challenge;

import java.util.*;

public class CoinChangeProblem {
    public static int minimumChange(Integer arr[], int amt) {
        Arrays.sort(arr, Comparator.reverseOrder());

        int count = 0;
        for (int coin : arr) {
            while (amt >= coin) {
                amt -= coin;
                count++;
            }
        }
        return amt == 0 ? count : -1; 
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = s.nextInt();
        Integer arr[] = new Integer[n];

        System.out.println("element in array:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Enter amount:");
        int amount = s.nextInt();

        int result = minimumChange(arr, amount);
        if (result != -1) {
            System.out.println("Minimum coins required: " + result);
        }


    }
}
