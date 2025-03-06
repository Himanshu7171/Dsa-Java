package BasicCode;

public class MissingNumberInArrayToN {

    public static int findmissingnumber(int [] nums){
        int n = nums.length;
        int expectedsum = n * (n + 1)/2 ;
        int actualSum  = 0 ;

        for(int num : nums){
            actualSum += num ;

        }
        return expectedsum - actualSum ;
        
       
             
        }
        public static void main(String [] args){
            int nums [] = { 1,2,4,5,6};
            System.out.println("Missing Number"+findmissingnumber(nums)); 
    }
}
