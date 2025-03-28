package BasicCode.ArrayDsa;

public class MajorityElementArray {
    
        public  static int majorityElement(int[] nums) {
    
          int candidate = nums[0];
          int count = 1 ;
    
          for( int i = 1; i < nums.length ; i++){
              if(nums[i] == candidate ){
                count++;
              }else{
                count--;
                if(count == 0 ){
                    candidate = nums[i];
                    count = 1 ;
    
                }
              }
          }  
          return candidate ;
    
        }
        public static void main(String[] args) {

            int nums[] = { 3,2,3};
            System.out.println(" Majority Element "+majorityElement(nums));
        }
    }

