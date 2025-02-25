package BasicCode;
import java.util.Scanner;

public class CountDigitsUsingLoop {

    public static void main ( String [] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the Number to Count Digit ");
        int num = sc.nextInt();

        int Count = 0 ;
        // Special case: If the number is 0, it has 1 digit.
        if (num == 0) { 
            Count = 1; // Since 0 has only one digit, set Count to 1.
        } else {
            // If the number is negative, convert it to positive.
            if (num < 0) { 
                num = num * -1; // Multiply by -1 to make it positive.
            }

            // Loop to count digits in the number.
            while (num > 0) { // Runs until num becomes 0.
                num = num / 10; // Removes the last digit (integer division).
                Count++; // Increments the digit count.
            }
        }
        System.out.println("Number Of Digit "+ Count);
       
    }
}
