package BasicCode;

import java.util.Scanner;

public class PalindromeInString {
 
    public static void main(String[] args) {
         Scanner sc = new Scanner( System.in);
         System.out.println(" Enter the String to check Palindrome");
         String s = new String();
         s = sc.nextLine();

         int left = 0 , right = s.length() - 1 ;
        boolean ispalindrome = false ;

         while( left < right){
            if( s.charAt(left) !=  s.charAt(right)){
            ispalindrome = true;
            break ;

            }
            left++;
            right--;
         }

         if(ispalindrome == true){
            System.out.println(" String is not Plaindrome " + s );
         }else{
            System.out.println("String is  Plaindrome "+ s);
         }
    }
}
