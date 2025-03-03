package BasicCode;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.next();
  
 // Read the input string from the user

    // Convert the string into a character array
    char arr[] = str.toCharArray();  

    // Initialize two pointers: one at the beginning and one at the end of the array
    int left = 0, right = arr.length - 1;

    // Loop until the two pointers meet in the middle
    while (left < right) {
        // Swap the characters at left and right positions
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // Move the pointers towards the center
        left++;
        right--;
    }

    // Convert the modified character array back into a string
    String reveString = new String(arr);
    System.out.println(" Reversed String "+ reveString);
}
}
