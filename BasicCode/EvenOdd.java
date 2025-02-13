package BasicCode;

import java.util.Scanner;

public class EvenOdd {
public static void main ( String [] args ){
     Scanner sc = new Scanner(System.in);

     int num = sc.nextInt() ;
     System.out.println("Enter the Number to Check Even or Odd ");

    if( num % 2 == 0 ){
        System.out.println(num + " is even no " );
    }else {
        System.out.println(num + " is odd no");
    }
}
}
