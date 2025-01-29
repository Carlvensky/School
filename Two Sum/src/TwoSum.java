import java.util.Scanner;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        
        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        
        // Input target value
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        
        int[] result = twoSum(nums, target);
        
        // print result
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No valid pair found.");
        }
        
        scanner.close();
    }
    
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; //returm empty arrat
    }
}
