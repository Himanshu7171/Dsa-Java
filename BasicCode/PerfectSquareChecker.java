package BasicCode ;

public class PerfectSquareChecker {

    public static boolean isperfectsquare(int nums){
        int sqrt = (int) Math.sqrt(nums);

        return ( sqrt * sqrt == nums);

    
    }
    public static void main(String[] args) {
        int nums = 16 ;
     
        System.out.println(isperfectsquare(nums));

        nums = 20 ;
        System.out.println(isperfectsquare(nums));
    }

}
