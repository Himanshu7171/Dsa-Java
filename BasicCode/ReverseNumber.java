package BasicCode;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter Number to Reverse it : ");
        int num = sc.nextInt();
        
        // to store reverse number 
        int reverse = 0;
        // loop  start upto given number
        while (num > 0) {
            // store remainder to reverse number 
            int digit = num % 10;
            // reverse number and store in reverse variable 
            reverse = reverse * 10 + digit;
            // finaly reverse number 
            num = num / 10;

        }
        System.out.println("Reverse Number " + reverse);
    }
}
