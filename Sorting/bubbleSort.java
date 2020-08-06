package Sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 23, 34, 11, 55, 41 };
        int n = arr.length;
        bSort(arr, n);
        printArray(arr, n);
    }

    static void bSort(int[] arr, int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}