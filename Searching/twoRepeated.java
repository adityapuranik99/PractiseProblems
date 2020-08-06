package Searching;

public class twoRepeated {
    static void tworepeated(int arr[], int n) {
        for (int i = 0; i < n + 2; i++) {
            if (arr[Math.abs(arr[i])] > 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            else
                System.out.print(Math.abs(arr[i]) + " ");
        }
    }
}