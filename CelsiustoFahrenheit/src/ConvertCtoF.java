import java.util.Scanner;

public class ConvertCtoF {
    public static void main(String[] args)  {
        // create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // prompt the user to enter celsius degree
        System.out.print("Enter temperature in celsius: ");

        // read the celsius degree from the user
        double celsius = scanner.nextDouble();

        // close the scanner
        scanner.close();

        // convert celsius to fahrenheit using the formulas
        double fahrenheit = (9.0 / 5) * celsius + 32;

        // display the results
        System.out.println(celsius + "degree celsius is equal to " + fahrenheit + "degree farhenheit.");
    }
}
