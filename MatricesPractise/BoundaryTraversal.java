package MatricesPractise;

class BoundaryTraversal {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        boundary(mat);
    }

    static void boundary(int[][] mat) {
        int startRow = 0;
        int endRow = mat.length - 1;
        int startCol = 0;
        int endCol = mat[0].length - 1;

        for (int i = startCol; i < endCol + 1; i++) {
            System.out.print(mat[startRow][i]);
        }
        for (int i = startRow + 1; i < endRow + 1; i++) {
            System.out.print(mat[i][endCol]);
        }
        for (int i = endCol - 1; i >= startCol; i--) {
            System.out.print(mat[endRow][i]);
        }
        for (int i = endRow - 1; i >= startRow; i--) {
            System.out.print(mat[i][startCol]);
        }
    }

}