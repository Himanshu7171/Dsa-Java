package BasicCode;

public class LinearSearchArray {

    public int linearsearch(int [] nums , int x){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == x){
                return i;
            }
            
        }
        return -1 ;
    }
    public static void main(String[] args) {
        LinearSearchArray l = new LinearSearchArray();

        int[] nums = {3, 5, 1, 9, 2};
        int x = 1 ;
        System.out.println(l.linearsearch(nums, x));
    }
}
