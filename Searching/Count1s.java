package Searching;

public class Count1s {

    static int countOnes(int arr[], int n) {
        int l = 0, h = n - 1, res = 0;
        int x = 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] > x)
                l = mid + 1;
            else if (arr[mid] < x)
                h = mid - 1;
            else {
                res = mid;
                l = mid + 1;
            }
        }
        return res + 1;
    }
}