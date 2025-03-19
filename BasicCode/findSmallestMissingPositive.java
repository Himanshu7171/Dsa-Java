package BasicCode;

public class findSmallestMissingPositive {

    public static int findsmlPostive(int [] nums){
        int n = nums.length;

        for(int i = 0 ; i < n ; i++){
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;

            }
        }
        for(int i = 0 ; i < n ; i++){
            if(nums[i] != i + 1){
                return i +1 ;

            }
        }
        return n +1 ;

    }
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1};
        System.out.println("Smallest missing positive number: " + findsmlPostive(nums));

        int[] nums2 = {1, 2, 0};
        System.out.println("Smallest missing positive number: " + findsmlPostive(nums2));

        int[] nums3 = {7, 8, 9, 11, 12};
        System.out.println("Smallest missing positive number: " + findsmlPostive(nums3));
    }
}
