package BasicCode;

import java.util.Scanner;

public class Numbercheck {

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
    System.out.println(" Enter the Number to Check the Number ");
      int num = sc.nextInt();

      if( num > 0 ){
        System.out.println("Number Is Positive :"+ num );
      }else if( num < 0){
        System.out.println(" Number is negative :" + num);

      }else{
        System.out.println(" Number is zero :" + num);
      }
    }
}
