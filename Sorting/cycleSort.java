package Sorting;

public class cycleSort {
    public static void main(String[] args) {
        int arr[] = { 20, 40, 50, 10, 30 };
        int n = arr.length;
        minSwaps(arr, n);
        printArray(arr, n);
    }

    static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void minSwaps(int[] arr, int n) {
        for (int cs = 0; cs < n; cs++) {
            int item = arr[cs];
            int pos = cs;
            for (int i = cs + 1; i < n; i++) {
                if (arr[i] < item)
                    pos++;
            }
            int temp = arr[pos];
            arr[pos] = item;
            item = temp;
            while (pos != cs) {
                pos = cs;
                for (int i = cs + 1; i < n; i++) {
                    if (arr[i] < item)
                        pos++;
                }
                temp = arr[pos];
                arr[pos] = item;
                item = temp;
            }
        }
    }
}