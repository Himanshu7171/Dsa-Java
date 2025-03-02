package BasicCode;

import java.util.Scanner;

public class PascalTriangle {
public static void main(String[] args) {
  
    Scanner sc = new Scanner(System.in);

    System.out.println(" Enter the NumRows For Pascal Triangle");
    int numrows = sc.nextInt();

    int[][] Triangle = new int[numrows][numrows];  // Declaring a 2D array to store values

    // Loop to iterate over each row of the Pascal's Triangle
    for (int i = 0; i < numrows; i++) {  
        
        // Loop to iterate over each column up to the current row index
        for (int j = 0; j <= i; j++) {  

            // First and last element of each row is always 1
            if (j == 0 || j == i) {  
                Triangle[i][j] = 1;  
            } else {
                // Each middle element is the sum of the two elements above it
                Triangle[i][j] = Triangle[i - 1][j - 1] + Triangle[i - 1][j];  
            }

            // Printing the current element of the Pascal's Triangle
            System.out.print(Triangle[i][j] + " ");  
        }

        // Moving to the next line after printing all values in the current row
        System.out.println();  
    }

}
}
