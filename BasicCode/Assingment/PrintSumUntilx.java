package BasicCode.Assingment;

import java.util.Scanner;

public class PrintSumUntilx {
    

 
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int sum = 0;
    
            while (true) {
                System.out.print("Enter a number (or 'x' to stop): ");
                String input = sc.next(); // Take input as a string
    
                if (input.equalsIgnoreCase("x")) {
                    break; // Stop if 'x' is entered
                }
    
                try {
                    int number = Integer.parseInt(input); // Convert input to integer
                    sum += number; // Add to sum
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a number or 'x' to stop.");
                }
            }
    
            System.out.println("Sum of all entered numbers: " + sum);
            sc.close();
        }
    }
    

