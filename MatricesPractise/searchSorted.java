package MatricesPractise;

class searchSorted {
    public static void main(String[] args) {
        int[][] mat = { { 10, 20, 30 }, { 15, 25, 80 }, { 35, 90, 100 } };
        int tar = 35;
        if (isPresent(mat, tar)) {
            System.out.print("Element Present");
        }
    }

    static boolean isPresent(int[][] mat, int tar) {
        int i = 0;
        int x = mat[0].length - 1;
        int y = mat[i][x];

        while (i < mat.length && x >= 0) {
            if (y > tar) {
                x--;
                y = mat[i][x];
            } else if (y < tar) {
                i++;
                y = mat[i][x];
            } else {
                return true;
            }
        }
        return false;
    }

}