package Sorting;

public class dutchFlag {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 1, 2, 0, 1, 0 };
        int n = arr.length;
        sort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sort(int arr[], int n) {
        int lo = 0, hi = n - 1, mid = 0;
        int temp;
        while (mid <= hi) {
            switch (arr[mid]) {
                case 0:
                    temp = arr[mid];
                    arr[mid] = arr[lo];
                    arr[lo] = temp;
                    lo++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[hi];
                    arr[hi] = temp;
                    hi--;
                    mid++;
                    break;

            }
        }
    }

    // static void swap(int a, int b) {
    // int temp = a;
    // a = b;
    // b = temp;
    // }
}