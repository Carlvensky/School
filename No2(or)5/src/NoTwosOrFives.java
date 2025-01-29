import java.util.Scanner;

public class NoTwosOrFives {
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
        
        System.out.println("Result: " + no14(nums));
        
        scanner.close();
    }
    
    public static boolean no14(int[] nums) {
        boolean hasTwo = false;
        boolean hasFive = false;
        
        for (int num : nums) {
            if (num == 2) hasTwo = true;
            if (num == 5) hasFive = true;
            
            if (hasTwo || hasFive ) return false;
        }
        
        return true;
    }
}
