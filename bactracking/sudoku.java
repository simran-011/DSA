package bactracking;

public class sudoku {

    public static boolean sudoku(int grid[][], int row, int col) {
        if (row == 9) {
            return true;
        }

        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (grid[row][col] != 0) {
            return sudoku(grid, nextRow, nextCol);
        }

        for (int i = 1; i <= 9; i++) {
            if (isSafe(grid, row, col, i)) {
                grid[row][col] = i;
                if (sudoku(grid, nextRow, nextCol)) {
                    return true;
                }
                grid[row][col] = 0;
            }
        }
        return false;
    }

    public static boolean isSafe(int grid[][], int row, int col, int val) {
        // column
        for (int i = 0; i <= 8; i++) {
            if (grid[i][col] == val) {
                return false;
            }
        }

        // row
        for (int j = 0; j <= 8; j++) {
            if (grid[row][j] == val) {
                return false;
            }
        }

        // grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (grid[i][j] == val) {
                    return false;
                }
            }
        }

        return true;

    }

    public static void main(String[] args) {
        int[][] grid = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };

    }
}
