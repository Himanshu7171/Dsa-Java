package BasicCode.ArrayDsa;

import java.util.Arrays;

public class PlusOneDigitArray {

    public int[] plusone(int [] digit){
        int n = digit.length;

        for( int i = n - 1 ; i >= 0 ; i--){
            if(digit[i] < 9){
                digit[i]++;
                return digit;

            }
            digit[i] =0 ;

        }
         // If all digits were 9, we need an extra digit at the beginning (e.g., 999 → 1000)
         int[] newNumber = new int[n + 1]; // Create a new array with one extra digit
         newNumber[0] = 1; // Set the first digit to 1 (since we added 1 to 999 → 1000)
         return newNumber; // Return the new array

    }
    public static void main(String[] args) {
        PlusOneDigitArray l = new PlusOneDigitArray();
         int[] test = {9, 9, 9};  // Example: 999 + 1 = 1000
        System.out.println("Output: " + Arrays.toString(l.plusone(test))); 
        // Expected Output: [1, 0, 0, 0]
         
    }
}
