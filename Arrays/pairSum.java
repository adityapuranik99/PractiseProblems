package Arrays;

class pairSum {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 1, 6, 3, 7 };
        int sum = 9;
        findPairS(arr, sum);
    }

    static void findPairS(int[] arr, int sum) {
        // Initialising two pointers
        int start = 0;
        int end = arr.length - 1;
        // Sorting the array since we need the numbers
        // not the indexes
        arr = sort(arr, 0, end);
        while (start <= end) {
            int curr_sum = arr[start] + arr[end];
            if (curr_sum > sum) {
                end--;
            } else if (curr_sum < sum) {
                start++;
            } else {
                System.out.print(arr[start] + " " + arr[end]);
            }
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /*
     * The main function that implements QuickSort() arr[] --> Array to be sorted,
     * low --> Starting index, high --> Ending index
     */
    static void sort(int arr[], int low, int high) {
        if (low < high) {
            /*
             * pi is partitioning index, arr[pi] is now at right place
             */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
}