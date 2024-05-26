
public class MaxElementFinder {


    public static int findMax(int[] nums) {

        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }


        int max = nums[0];

       
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {1, 2, 3, 4, 5};

        // Find and print the maximum element in the array
        System.out.println("The maximum element is: " + findMax(nums)); // Output: 5
    }
}
