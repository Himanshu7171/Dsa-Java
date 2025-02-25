package BasicCode;

import java.util.Scanner;

public class FactorialOdN {


public static void main(String[] args) {
    Scanner sc = new Scanner( System.in);

    int n = sc.nextInt(); // Reads an integer input from the user and stores it in variable `n`.

    int Factorial = 1; // Variable to store the factorial result, initialized to 1.

    // Condition to check if the number is negative.
    if (n < 0) { 
        System.out.println("Factorials cannot be negative."); // Prints error message for negative input.
    } else {

        // A loop to calculate the factorial of `n`.
        for (int i = 1; i <= n; i++) { 
            Factorial *= i; // Multiplies `Factorial` by `i` in each iteration.
        }

    
    System.out.println("factor of " + n + " Is facotrial " + Factorial );
    }
}
}
