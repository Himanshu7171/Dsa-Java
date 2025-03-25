package BasicCode;

public class findPeakElementSearchBinary {
    public  static int findpeakElment(int []nums){

    
    int left =  0 ;
    int right = nums.length  - 1;
    while (left < right) {
        int mid = left + (right - left) / 2; // Avoids overflow

        if (nums[mid] > nums[mid + 1]) {
            right = mid; // Peak is in the left half (or mid itself)
        } else {
            left = mid + 1; // Peak is in the right half
        }
    }
    
    return left; // `left` will point to the peak element

}
public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 1};
    int[] nums2 = {1, 2, 1, 3, 5, 6, 4};

    System.out.println(findpeakElment(nums2));
    System.out.println(findpeakElment(nums1));
}
}
