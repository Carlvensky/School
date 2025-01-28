import java.util.Scanner;
public class Search {
    public static void main(String[] args) throws Exception {
        //Initialize numbers and # the user will search
        int[] numbers = {11, 82, 11, 16, 4, 7};
        int search = 0;
        
        //Use scanner to get user input and assign it to search
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search for: ");
        search = scanner.nextInt();

        //for loop to search for the number if found break out of the loop
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == search) {
                System.out.println("Number found at index " + i);
                break;
            } else {
                System.out.println("Number not found");
                break;
            }
        }
        scanner.close();
    }
}
