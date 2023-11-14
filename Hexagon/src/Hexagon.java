import java.util.Scanner;

public class Hexagon {
    // private Variables
    private final double sideOfHexagon;

    // constructor
    public Hexagon(double sideOfHexagon) {
        this.sideOfHexagon = sideOfHexagon;
    }

    // core
    public double calculateAreaOfHexagonWithOneSide() {
        return (6 * Math.pow(this.sideOfHexagon, 2)) / (4 * Math.tan(Math.PI / 6));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side of the hexagon: ");
        double userInput = input.nextDouble();

        Hexagon userHexagon = new Hexagon(userInput);

        System.out.printf("The area of the hexagon is %.2f%n", userHexagon.calculateAreaOfHexagonWithOneSide());
    }
}
