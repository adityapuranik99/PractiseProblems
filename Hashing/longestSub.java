package Hashing;

import java.util.HashSet;

public class longestSub {

    static int findLongest(int arr[], int n) {
        HashSet<Integer> hs = new HashSet<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            if (!hs.contains(arr[i] - 1)) {
                int j = arr[i];
                while (hs.contains(j)) {
                    j++;
                }
                if (ans < j - arr[i])
                    ans = j - arr[i];
            }
        }
        return ans;
    }
}