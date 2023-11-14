import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        // Create a Scanner object to take input
            Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the month
            System.out.print("Enter the month (1-12): ");
                int month = scanner.nextInt();

        // Prompt the user to enter the year
            System.out.print("Enter the year: ");
                int year = scanner.nextInt();

        // Close the scanner
            scanner.close();

        // Check if the month is valid
                if (month < 1 || month > 12) {
                    System.out.println("Invalid month. Please enter a month between 1 and 12.");
                } else {
            // Determine the number of days in the month enter
                int daysInMonth = getDaysInMonth(month, year);

        // Display the result
            System.out.println(getMonthName(month) + " " + year + " had " + daysInMonth + " days.");
        }
    }

    // Method to get the number of days in a month
    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                // Check for leap year or not
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1; // Invalid month
        }
    }

    // Method to get the name of a month
    private static String getMonthName(int month) {
        String[] monthNames = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month - 1];
    }
}