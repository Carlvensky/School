import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) throws Exception {

        int[] array;

        Scanner scanner = new Scanner(System.in);

        int n = 0;
        do {
            System.out.print("How many integers do you want to enter? ");
            n = scanner.nextInt();
        } while (n <= 0);

        scanner.close();
        
    }
}
