package BasicCode;

import java.util.Scanner;

public class FindTheLargestNumber {

    public static void main ( String [] args ){
        Scanner sc = new Scanner( System.in);
       
        System.out.println( " Enter the Number1 ");
        int num1 = sc.nextInt();
        System.out.println( " Enter the Number2 ");
        int num2 = sc.nextInt();
        System.out.println( " Enter the Number3 ");
        int num3 = sc.nextInt();

        int largest = 0 ;
        // this condition check the num1 is larger than another 2 number 
        if( num1 >= num2 && num1 >= num3 ){
         largest = num1 ;

         // this condition check the num2 is larger than another 2 number 
        }else if ( num2 >= num1 && num2 >= num3){
            largest = num2;

        // above conditon proves that num3 is the largest number
        }else{
            largest = num3 ;

        }

        System.out.println(" The Largest Number is :"+ largest);
        sc.close();
    }
}
