import java.util.*;

public class Backtracking {
    public static void main(String[] args){
        System.out.println("Backtracking");
    }

}




/*
1. Print all possible terms permutations of a string
Time Complexity = O(n*n!)

public static void printPerm(String str, String permutation, int index){
        if (str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++ ){
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            printPerm(newStr, permutation+currChar, index+1);
        }
    }
    public static void main(String[] args){
        String str = "abc";
        printPerm(str, "", 0);
    }
*/


/*
2. N-Queens
Time Complexity = O(n^n)

public boolean isSafe(int row, int col, char[][] board) {

        // HORIZONTAL
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // VERTICAL
        for (int i = 0; i < board.length; i++) { // fixed loop variable
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // UPPER LEFT
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // UPPER RIGHT
        r = row;
        for (int c = col; c < board.length && r >= 0; c++, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // LOWER LEFT
        r = row;
        for (int c = col; c >= 0 && r < board.length; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // LOWER RIGHT
        r = row; // reset r to row
        for (int c = col; c < board.length && r < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards) { // removed extra argument
        List<String> newBoard = new ArrayList<>(); // renamed variable to avoid conflict

        for (int i = 0; i < board.length; i++) {
            String row = ""; // moved variable inside loop
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else {
                    row += '.';
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n]; // fixed array initialization

        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        Backtracking bt = new Backtracking();
        int n = 4; // Example for 4-queens problem
        List<List<String>> solutions = bt.solveNQueens(n);
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
*/