import java.util.Scanner;

public class Duplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] distinctNumbers = eliminateDuplicates(numbers);

        System.out.print("The distinct numbers are: ");
        for (int number : distinctNumbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }

    public static int[] eliminateDuplicates(int[] list) {
            //Count the number
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (list[i] == list[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                count++;
            }
        }

            //create a new array with distinct elements
        int[] distinctNumbers = new int[count];
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (list[i] == list[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                distinctNumbers[index++] = list[i];
            }
        }

        return distinctNumbers;
    }
}
