package Arrays;

class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 5, 6 };
        rotateArr(arr, 2);
        printArr(arr);
    }

    // To reverse an array
    static void ReverseArr(int[] arr, int l, int h) {
        while (l < h) {
            int temp = arr[h];
            arr[h] = arr[l];
            arr[l] = temp;
            l++;
            h--;
        }
    }

    // To rotate an array from a given point d
    static void rotateArr(int[] arr, int d) {
        ReverseArr(arr, 0, d - 1);
        ReverseArr(arr, d, arr.length - 1);
        ReverseArr(arr, 0, arr.length - 1);
    }

    static void printArr(int[] arr) {
        for (int i = 0; i < (arr.length); i++) {
            System.out.println(arr[i]);
        }
    }

}