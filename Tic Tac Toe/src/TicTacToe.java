import java.util.Scanner;

public class TicTacToe {
    private static final int SIZE = 3;
    private static char[][] board = new char[SIZE][SIZE];
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        initializeBoard();
        boolean isX = true;
        int moves = 0;
        
        while (true) {
            printBoard();
            System.out.println("Player " + (isX ? "X" : "O") + "'s turn.");
            int row, col;
            
            while (true) {
                System.out.print("Enter row (0-2): ");
                row = scanner.nextInt();
                System.out.print("Enter column (0-2): ");
                col = scanner.nextInt();
                
                if (row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == ' ') {
                    board[row][col] = isX ? 'X' : 'O';
                    break;
                } else {
                    System.out.println("Invalid move, try again.");
                }
            }
            
            moves++;
            if (checkWin()) {
                printBoard();
                System.out.println("Player " + (isX ? "X" : "O") + " wins!");
                break;
            }
            
            if (moves == SIZE * SIZE) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }
            
            isX = !isX;
        }
        scanner.close();
    }
    
    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' ';
            }
        }
    }
    
    private static void printBoard() {
        System.out.println("Current board:");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(" " + board[i][j] + " ");
                if (j < SIZE - 1) System.out.print("|");
            }
            System.out.println();
            if (i < SIZE - 1) System.out.println("-----------");
        }
    }
    
    private static boolean checkWin() {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) return true;
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) return true;
        }
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) return true;
        if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) return true;
        
        return false;
    }
}

