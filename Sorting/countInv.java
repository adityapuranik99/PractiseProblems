package Sorting;

public class countInv {
    public static void main(String[] args) {
        int arr[] = { 12, 3, 5, 19, 38, 23, 9 };
        int l = 0;
        int r = arr.length - 1;
        int res = countInversion(arr, l, r);
        System.out.println(res);
    }

    public static int countInversion(int arr[], int l, int r) {
        // int res = 0;
        // for(int i = 0; i < n-1; i++)
        // {
        // for(int j = i + 1; j < n ; j++)
        // {
        // if(arr[i]> arr[j])
        // {
        // res++;
        // }
        // }
        // }
        // return res;

        int res = 0;
        if (l < r) {
            int m = (l + r) / 2;
            res += countInversion(arr, l, m);
            res += countInversion(arr, m + 1, r);
            res += countandMerge(arr, l, m, r);
        }
        return res;
    }

    static int countandMerge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[i + l];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[m + 1 + i];
        }
        int res = 0, i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
                res = res + (n1 - i);
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
        return res;
    }

    static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}