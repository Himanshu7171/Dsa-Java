package BasicCode.ArrayDsa;

import java.util.Arrays;

public class RotateArray {

    // Method to rotate the array
    public void rotate(int nums[], int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n

        // Step 1: Reverse entire array
        reverse(nums, 0, n - 1);
        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);
        // Step 3: Reverse remaining elements
        reverse(nums, k, n - 1);
    }

    // Helper method to reverse the array
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Create an instance of RotateArray
        RotateArray obj = new RotateArray();
        
        int[] nums = {1, 2, 3, 4, 5, 6, 7}; // Example array
        int k = 3; // Number of rotations

        System.out.println("Original Array: " + Arrays.toString(nums));

        obj.rotate(nums, k); // Correctly calling the non-static method using an instance

        System.out.println("Rotated Array: " + Arrays.toString(nums));
    }




}
