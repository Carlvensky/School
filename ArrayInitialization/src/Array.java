public class Array {
    public static void main(String[] args) throws Exception {

        // Array initialization
        int[] numbers = {1, 2, 3, 4, 5};


        //A standard for loop to print the array numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("The results for normal for loop is: " + numbers[i]);
        }

        //To have an empty line between the two loops
        System.out.println();

        //An enhance for loop to print the array numbers
        for (int number : numbers) {
            System.out.println("The results for enhance for loop is: " + number);
        }
    }
}
