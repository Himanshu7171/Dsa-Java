package BasicCode.ArrayDsa;

public class missingNumberArray {

    public static int missingnumber(int nums[]){
        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int actualsum  = 0 ;

        for (int i : nums) {
            actualsum += i ;
        
        }
        return expected - actualsum ;


    }
    public static void main(String[] args) {
        int nums [] = { 3,0,1};
             int result = missingnumber(nums);
        System.out.println(" Missing number Of Array :" + result);
    }
}
