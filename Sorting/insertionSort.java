package Sorting;

public class insertionSort {
    public static void main(String[] args) {
        int arr[] = { 12, 32, 43, 21, 22 };
        int n = arr.length;
        insertSort(arr, n);
        printArray(arr, n);
    }

    static void insertSort(int[] arr, int n) {
        int i, j;
        for (i = 1; i < n; i++) {
            int key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}