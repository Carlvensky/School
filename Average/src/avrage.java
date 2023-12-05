import java.util.Scanner;

public class avrage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vals = new double[10];
        System.out.print("Please enter ten double values: ");

        for (int i = 0; i < 10; i++)
            vals[i] = scanner.nextDouble();

        System.out.printf("The average is: %.2f", average(vals));

        scanner.close();
    }

    public static double average(double[] array) {
        double sum = 0.0;
        for (double val : array)
            sum += val;
        return sum / array.length;
    }
}