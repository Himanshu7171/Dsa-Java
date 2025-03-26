package BasicCode;

public class FirstLastPositionArray {
    public static int[] searchRange(int[] nums, int target) {
        return new int[]{findBound(nums, target, true), findBound(nums, target, false)};
    }

    private static int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1, result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;
                // If searching for the first occurrence, move left
                if (isFirst) right = mid - 1;
                // If searching for the last occurrence, move right
                else left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;  // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);

        // Print result
        System.out.println("[" + result[0] + ", " + result[1] + "]");  
    }
    
}
