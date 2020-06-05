package Arrays;

public class subarrayGivenSum {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4, 5, 2 };
        int n = arr.length;
        int sum = 10;
        givenSum(arr, n, sum);
    }

    static int givenSum(int[] arr, int n, int sum) {
        int currSum = arr[0], s = 0, index;

        // Taking up a starting point t
        for (index = 1; index <= n; index++) {
            while (currSum > sum && s < index - 1) {
                currSum -= arr[s];
                s++;
            }

            if (currSum == sum) {
                int index2 = index - 1;
                System.out.print("Between " + s + " and " + index2);
                return 1;
            }

            if (index < n) {
                currSum += arr[index];
            }
        }

        System.out.print("Element not found");
        return 0;
    }
}