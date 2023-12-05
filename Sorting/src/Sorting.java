import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            //prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

            //display the numbers in increasing order
        displaySortedNumbers(num1, num2, num3);

        scanner.close();
    }

            //method to display three numbers in increasing order
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;

            //sort the numbers
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

            //display the sorted numbers
        System.out.println("The numbers in increasing order are: " + num1 + " " + num2 + " " + num3);
    }
}
