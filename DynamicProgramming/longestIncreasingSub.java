package DynamicProgramming;

public class longestIncreasingSub {
    int lis(int[] arr, int n) {
        int[] lis = new int[n];
        lis[0] = 1;
        for (int i = 1; i < n; i++) {
            lis[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }
        int res = lis[0];
        for (int i = 1; i < n; i++) {
            res = Math.max(res, lis[i]);
        }
        return res;
    }

    int LIS(int arr[], int n) {
        int[] tail = new int[n];
        int len = 1;
        tail[0] = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > tail[len - 1]) {
                tail[len] = arr[i];
                len++;
            } else {
                int c = ceilIdx(tail, 0, len - 1, arr[i]);
                tail[c] = arr[i];
            }
        }
        return len;
    }

    int ceilIdx(int[] tail, int low, int high, int comp) {
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (tail[mid] >= comp) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }
}