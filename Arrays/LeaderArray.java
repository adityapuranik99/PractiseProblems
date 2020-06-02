package Arrays;

// Element is called leader, if no element to right is greater than the element.
class LeaderArray {
    public static void main(String[] args) {
        int arr[] = { 5, 3, 20, 15, 8, 3 };
        leadArr(arr);
    }

    // Traverse from the right side, and keep printing elements greater than max.
    static void leadArr(int[] arr) {
        int max = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > max) {
                System.out.print(arr[i] + " ");
                max = arr[i];
            }
        }
    }

}