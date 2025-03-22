package BasicCode;

public class MajorityElement {

    public static int findmajorityelement(int [] nums){
        int candidate = 0; // To store the potential majority element
        int count = 0; // Count to track the frequency of the candidate
        
        // Step 1: Find the potential majority element using Boyer-Moore Voting Algorithm
        for (int num : nums) {
            if (count == 0) {
                candidate = num; // Set new candidate
            }
            // If current num is the candidate, increase count; otherwise, decrease it
            if (num == candidate) {
                count += 1; // Increase count if num matches candidate
            } else {
                count -= 1; // Decrease count if num is different
            }
        }

        // Step 2: Return the candidate (Guaranteed to be the majority element as per problem statement)
        return candidate;
    }
 
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println("Majority Element: " + findmajorityelement(nums)); 
    
    }
}


