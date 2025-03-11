package BasicCode.ArrayDsa;

public class TwoSumArray {

    public static int[] Twosum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Return the indices of the two numbers
                }
            }
        }
        return new int[]{}; // Return empty array if no solution found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; // Example array
        int target = 9;

        int[] result = Twosum(nums, target);
        
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found!");
        }
    }
}