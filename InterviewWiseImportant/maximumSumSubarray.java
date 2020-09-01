package InterviewWiseImportant;

public class maximumSumSubarray {
    public static int findMaxSubArraySum(int k, int arr[]) {
        int n = arr.length;
        if (k > n)
            return -1;
        int windowSum = 0, max = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        max = (int) Math.max(windowSum, max);
        for (int i = k; i < n; i++) {
            windowSum = windowSum + arr[i] - arr[i - k];
            max = (int) Math.max(max, windowSum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 6, 4, 2, 1 };
        int k = 3;
        int ans = findMaxSubArraySum(k, arr);
        System.out.println(ans);
    }
}