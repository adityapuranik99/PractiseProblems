package Searching;

public class floorSqrt {

    int floorSqr(int x) {
        if (x == 0 || x == 1)
            return x;
        int start = 0, end = x, ans = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid < x) {
                start = mid + 1;
                ans = mid;
            } else if (mid * mid == x) {
                return mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}