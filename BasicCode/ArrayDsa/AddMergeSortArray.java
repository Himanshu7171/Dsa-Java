package BasicCode.ArrayDsa;

import java.util.Arrays;

public class AddMergeSortArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Pointers for nums1 and nums2 starting from the end of actual elements
        int i = m - 1; // Last index of actual elements in nums1
        int j = n - 1; // Last index of nums2
        int k = m + n - 1; // Last index of nums1 (considering extra space)

        // Merge in reverse order
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i]; // Place the larger value at the end
                i--; // Move nums1 pointer left
            } else {
                nums1[k] = nums2[j]; // Place the larger value at the end
                j--; // Move nums2 pointer left
            }
            k--; // Move the merge pointer left
        }

        // If nums2 still has elements left, copy them to nums1
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
        
        // No need to check for nums1, because remaining elements are already in place
    }

public static void main(String[] args) {
     int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1)); // Output: [1, 2, 2, 3, 5, 6]
    }

}

