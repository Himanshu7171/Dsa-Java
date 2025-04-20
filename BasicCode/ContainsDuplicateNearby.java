 package BasicCode;

import BasicCode.ArrayDsa.largestRectangleAreaArray;

public class ContainsDuplicateNearby {
 public boolean containsNearbyDuplicate(int[] nums, int k) {
        int[][] store = new int[nums.length][2]; // Simulate key-value store
        int size = 0; // Keeps track of how many unique elements we have seen

        for (int i = 0; i < nums.length; i++) {
            boolean found = false;

            // Search for current number in the store
            for (int j = 0; j < size; j++) {
                if (store[j][0] == nums[i]) {
                    // If found, check the distance
                    if (i - store[j][1] <= k) {
                        return true;
                    }

                    // Update the last index
                    store[j][1] = i;
                    found = true;
                    break;
                }
            }

            // If not found, add it to the store
            if (!found) {
                store[size][0] = nums[i];
                store[size][1] = i;
                size++;
            }
        }

        return false; // No such duplicates found within k distance
    }
    public static void main(String[] args) {
        ContainsDuplicateNearby nl = new ContainsDuplicateNearby();

        int nums[] = {1, 2, 3, 1}, k = 3;

        System.out.println(nl.containsNearbyDuplicate(nums, k));
    }
}