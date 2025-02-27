package BasicCode;

import java.util.Scanner;

public class PalindromeInt {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int num = Sc.nextInt();
        int rev = 0  , flag ;
        flag = num ;

        while( num > 0 ){
            rev= ( rev * 10) + num % 10 ;
            num =num /10 ; 
        }

        if( rev == flag ){
            System.out.println( flag + " Is Palindrome Number ");
        }else {
            System.out.println(flag + " Is not Plaindrome Number");
        }

    }
}
