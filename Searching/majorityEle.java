package Searching;

public class majorityEle {

    int majorityElement(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        int res = 0, count = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[res])
                count++;
            else
                count--;
            if (count == 0) {
                res = i;
                count = 1;
            }
        }
        count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == arr[res])
                count++;
        }
        if (count <= n / 2)
            return -1;
        return arr[res];
    }
}