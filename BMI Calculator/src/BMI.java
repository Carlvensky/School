import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
            // create a scanner to read input
                Scanner scanner = new Scanner(System.in);

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

            // prompt the user for weight
                System.out.printf("Enter weight in pounds: ");
                    double weight = scanner.nextDouble();
            // prompt the user for feet
                System.out.printf("Enter feet: ");
                    int feet = scanner.nextInt();
            // prompt the user for inches
                System.out.printf("Enter inches: ");
                    int inches = scanner.nextInt();

            // close the scanner
                scanner.close();

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = (feet * 12 + inches) * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("BMI is: " + bmi);
        if (bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
