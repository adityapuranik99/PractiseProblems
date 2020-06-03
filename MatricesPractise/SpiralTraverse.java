package MatricesPractise;

class SpiralTraverse {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 }, { 12, 13, 14, 5 }, { 11, 16, 15, 6 }, { 10, 9, 8, 7 } };
        spiral(mat);
    }

    static void spiral(int[][] mat) {
        int startRow = 0;
        int endRow = mat.length - 1;
        int startCol = 0;
        int endCol = mat[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int i = startCol; i < endCol + 1; i++) {
                System.out.print(mat[startRow][i]);
            }
            for (int i = startRow + 1; i < endRow + 1; i++) {
                System.out.print(mat[i][endCol]);
            }
            for (int i = endCol - 1; i >= startCol; i--) {
                System.out.print(mat[endRow][i]);
            }
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(mat[i][startCol]);
            }
            startCol += 1;
            endCol -= 1;
            endRow -= 1;
            startRow += 1;
        }
    }
}