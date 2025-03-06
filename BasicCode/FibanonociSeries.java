package BasicCode;

public class FibanonociSeries {

    public static void main(String[] args) {
         int num1 = 0 , num2 = 1  ;
         int nums = num1 + num2 ;

         System.out.println( " Fibanonci Series : ");
         for (int i = 0; i < 10; i++) {
            nums = num1 + num2 ;
            System.out.print(" " + nums);
            num1 = num2 ;
            num2 = nums;

            
         }
    }
}
