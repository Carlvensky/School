import java.util.Scanner;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a letter
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0); // Read the first character

        // Check if the input is a single character and a letter
        if (Character.isLetter(letter) && Character.isAlphabetic(letter)) {
            // Check if the input is a vowel
            if (isVowel(letter)) {
                System.out.println(letter + " is a vowel.");
            } else {
                System.out.println(letter + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter only a single letter in the alphabet.");
        }

        // Close the Scanner
        scanner.close();
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
