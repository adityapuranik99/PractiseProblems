package Hashing;

// Problem : You have an array arr of size n. You also have a
// integer X. You have to check if there is a pair in arr whose
// sum is X.

// i < j and arr[i]+ arr[j] = X; 0<i<j<n

// i/p: {1,9,3, 2, 4, 7}, X =13
// o/p: Yes {9 + 4}

// i/p: {1,9, 3, 2, 4, 7}, X = 10
// o/p: Yes{3+7}

public class pairSum {

    // BruteForce
    boolean pS(int[] arr, int sum) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; i++) {
                if (arr[i] + arr[j] == X)
                    return true;
            }
        }
        return false;
    }

    // Two pointers
    boolean pSum(int[] arr, int sum) {
        // arr.Sort()
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            int curr_sum = arr[l] + arr[r];
        }

    }
}