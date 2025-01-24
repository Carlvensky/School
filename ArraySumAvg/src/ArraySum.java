import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int n = 0;

        //A do while loop to ensure the user enter an integer greater than 0
        do {
            System.out.print("How many integers do you want to enter? ");
            n = scanner.nextInt();
        } while (n <= 0);

        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Please enter one of your " + n + " integers ");
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int num: array) {
            sum += num;
        }

        double avg = (double) sum / n;

        //Adding an empty line for better readability
        System.out.println("");
        System.out.println("The sum of your " + n + " integers is " + sum);
        System.out.println("The average of your " + n + " integers is " + avg);

        scanner.close();
        
    }
}
