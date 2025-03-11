package BasicCode.ArrayDsa;

public class RemoveDuplicateArray {

    public  static int duplicate(int []nums){

        if(nums.length == 0) return 0 ;

        int i = 0 ;

        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != nums[i]  ){
                i++;
                nums[i] = nums[j];

            }

        }
        return i +1 ;

    }
    public static void main(String[] args) {
        
        int nums [] =  { 1,2,3,4,5,5,6,7,7,8};

        int newlength = duplicate(nums);
        System.out.println(" duplicate element " + newlength);
        System.out.println(" Modified Array");

        for (int i = 0; i < nums.length; i++) {
            System.out.print (nums [i] + " ");
        }
    }
}
