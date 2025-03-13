package BasicCode.ArrayDsa;

public class maxSubArray {

    public static int maxsubarry(int [] nums){
        int maxnumber = Integer.MIN_VALUE;
        int currentsum = 0 ;

        for (int i : nums) {
            currentsum += i ;

        
        if(currentsum > maxnumber){
            maxnumber = currentsum ;

        }
        if (currentsum < 0) {
            currentsum = 0;
        }


    }
    return maxnumber;


    }
    public static void main(String[] args) {
        int nums [] = {2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(" Maximum SubAarray :" + maxsubarry(nums));
    }
}
