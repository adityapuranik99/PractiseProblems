package Searching;

public class peak {

    static int peakElement(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        if (n == 2) {
            if (arr[0] > arr[1])
                return arr[0];
            else
                return arr[1];
        }
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid == 0) {
                if (arr[mid] >= arr[mid + 1])
                    return arr[mid];
            } else if (mid == n - 1) {
                if (arr[mid] >= arr[mid - 1])
                    return arr[mid];
            } else if (arr[mid] >= arr[mid - 1] && arr[mid] >= arr[mid + 1])
                return arr[mid];
            else if (arr[mid] < arr[mid - 1] && arr[mid] >= arr[mid + 1])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}