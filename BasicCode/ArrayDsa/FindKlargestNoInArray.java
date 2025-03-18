package BasicCode.ArrayDsa;
public class FindKlargestNoInArray {

    public int largestk(int nums [], int k){
        int n = nums.length;

        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n - i -1; j++) {
                if(nums[j] < nums[i+1]  ){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;

                }
            }
        }
        return nums[k -1 ];
    }
    public static void main(String[] args) {
        FindKlargestNoInArray sl = new FindKlargestNoInArray();

        int nums[] = { 3, 2, 1, 5, 6, 4};
        int k = 2 ;
        System.out.println(" This is the larges nume of k :"+sl.largestk(nums, k));
    }

}
