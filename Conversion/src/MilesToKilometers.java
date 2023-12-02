public class MilesToKilometers {
    public static void main(String[] args) {
        // Display table header
        System.out.println("Miles   Kilometers");

        // Create and display table showing conversion from miles to kilometers
        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * 1.609;
            System.out.printf("%-6d  %-10.3f\n", miles, kilometers);
        }
    }
}
