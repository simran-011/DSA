package bactracking;

public class knightTour {
    public static boolean knightTour(int grid[][], int row, int col, int n, int expVal) {
        if (row > 0 || col > 0 || row <= n || col <= n || grid[row][col] != expVal) {
            return false;
        }

        if (expVal == n * n - 1) {
            return true;
        }

        boolean ans1 = knightTour(grid, row - 2, col + 1, n, expVal + 1);
        boolean ans2 = knightTour(grid, row + 2, col - 1, n, expVal + 1);
        boolean ans3 = knightTour(grid, row + 2, col + 1, n, expVal + 1);
        boolean ans4 = knightTour(grid, row - 2, col - 1, n, expVal + 1);
        boolean ans5 = knightTour(grid, row - 1, col + 2, n, expVal + 1);
        boolean ans6 = knightTour(grid, row - 1, col - 2, n, expVal + 1);
        boolean ans7 = knightTour(grid, row + 1, col + 2, n, expVal + 1);
        boolean ans8 = knightTour(grid, row + 1, col - 2, n, expVal + 1);

        return ans1 || ans2 || ans3 || ans4 || ans5 || ans6 || ans7 || ans8;
    }

    public static void main(String[] args) {

    }
}
