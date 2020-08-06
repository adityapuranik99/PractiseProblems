package Searching;

public class leftIndex {
    static int leftindex(int n, int arr[], int x) {
        int low = 0, high = n - 1, res = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < x)
                low = mid + 1;
            else if (arr[mid] > x)
                high = mid - 1;
            else {
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }
}