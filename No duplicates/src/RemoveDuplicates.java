import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        /// Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }


        // Remove duplicates and get the count of unique elements
        int uniqueCount = removeDuplicates(nums);

        // Print results
        System.out.println("Number of unique elements: " + uniqueCount);
        System.out.print("Modified array: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i] + " ");
        }

        scanner.close();
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int insertPos = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[insertPos] = nums[i];
                insertPos++;
            }
        }
        return insertPos;
    }
}