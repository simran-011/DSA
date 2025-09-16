package bactracking;

public class queen {
    public static void nqueen(char board[][], int row) {
        if (row == board.length) {
            // System.out.println("---------board-----------");
            // printBoard(board);
            count++;
            return;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nqueen(board, row + 1);
                board[row][j] = 'X';
            }

        }
    }

    public static boolean nqueenOne(char board[][], int row) {
        if (row == board.length) {
            System.out.println("---------board-----------");
            printBoard(board);

            return true;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nqueenOne(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'X';
            }

        }
        return false;
    }

    public static void printBoard(char board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // top
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diag right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diag left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static int count = 0;

    public static void main(String[] args) {
        char board[][] = new char[5][5];
        // initialisation
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = 'X';
            }
        }
        nqueen(board, 0);
        System.out.println("no of possible cases for given n is: " + count);
    }
}
