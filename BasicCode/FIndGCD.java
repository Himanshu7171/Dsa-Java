package BasicCode;

import java.util.Scanner;

public class FIndGCD {

    public static int findgcd(int a , int b ){
         while ( b == 0 ){
            int temp = b ;
            b = a% b;
            a = temp ;
         
            break ;

         }
         return a ;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Number to Find GCD");
        int num1 = sc.nextInt();

        System.out.println( " Entert the Number to Find GCD");
       int num2 = sc.nextInt();

       int gcd =   findgcd(num1, num2);

       System.out.println(" GCD of " + num1+ " and " + num2 + " is " + gcd);


    }
}
