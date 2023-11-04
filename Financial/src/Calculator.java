import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the subtotal
        System.out.print("Enter the subtotal: ");
        double subtotal = scanner.nextDouble();

        // Prompt the user to input the gratuity rate
        System.out.print("Enter the gratuity rate (in percentage): ");
        double gratuityRate = scanner.nextDouble();

        // Close the Scanner
        scanner.close();

        // Calculate the gratuity amount
        double gratuity = (subtotal * gratuityRate) / 100;

        // Calculate the total amount
        double total = subtotal + gratuity;

        // Display the results
        System.out.println("Gratuity: $" + gratuity);
        System.out.println("Total: $" + total);
    }
}
