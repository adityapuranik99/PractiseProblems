package Searching;

public class findFloor {

    static int findFloorIndex(int[] arr, int low, int high, int n) {
        if (low > high)
            return -1;
        if (arr[high] < n)
            return high;
        int mid = (low + high) / 2;
        if (arr[mid] == n)
            return mid;
        if (mid > 0 && arr[mid - 1] <= n && n < arr[mid])
            return mid - 1;
        if (n < arr[mid])
            return findFloorIndex(arr, low, mid - 1, n);
        return findFloorIndex(arr, mid + 1, high, n);
    }
}