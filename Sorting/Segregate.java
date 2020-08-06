package Sorting;

public class Segregate {
    public static void main(String[] args) {
        int arr[] = { -1, 2, 1, -2, 5, 3 };
        int n = arr.length;
        sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sort(int arr[], int n) {
        int i = -1, j = n;
        while (true) {
            do {
                i++;
            } while (arr[i] < 0);
            do {
                j--;
            } while (arr[j] > 0);
            if (i >= j)
                return;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}