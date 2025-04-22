package BasicCode;

import java.util.HashSet;
import java.util.Set;

public class LonngestConsecutiveNumber {

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num); // Store numbers in the set for O(1) lookup
        }

        int longest = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) { // Check if it's the start of a sequence
                int currentNum = num;
                int currentLength = 1;

                while (numSet.contains(currentNum + 1)) { // Count consecutive elements
                    currentNum++;
                    currentLength++;
                }

                longest = Math.max(longest, currentLength); // Track longest sequence
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums)); // Output: 4
    }

}
