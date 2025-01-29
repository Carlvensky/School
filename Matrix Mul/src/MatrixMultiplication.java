import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        // Input matrix dimensions
        System.out.print("Enter dimensions m, n, p: ");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        
        int[][] A = new int[m][n];
        int[][] B = new int[n][p];
        int[][] C = new int[m][p];
        
        // Input matrix A
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        
        // Input matrix B
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                B[i][j] = scanner.nextInt();
            }
        }
        
        // Compute matrix C = A * B
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                C[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        
        // Print resulting matrix C
        System.out.println("Resulting matrix C:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
