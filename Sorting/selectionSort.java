package Sorting;

public class selectionSort {
    public static void main(String[] args) {
        int arr[] = { 24, 45, 25, 21, 66 };
        int n = arr.length;
        sSort(arr, n);
        printArray(arr, n);
    }

    static void sSort(int[] arr, int n) {
        int i, j, min_idx;
        for (i = 0; i < n - 1; i++) {
            min_idx = i;
            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}