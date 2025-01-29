public class Bublesort {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] numbers = { 5, 1, 9, 3, 5, 6 };

        //print the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Unsorted numers are: " + numbers[i]);
        }

        System.out.println();

        //bubble sort
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            } 
            System.out.println("Sorted numbers are: " + numbers[i]);
        }
    }
}
