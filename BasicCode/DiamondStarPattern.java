package BasicCode;

public class DiamondStarPattern {

    public static void main(String[] args) {
        int row = 7;

        for (int i = 0; i < row; i++) {  
            // Loop to print spaces before stars
            for (int j = 0; j < row - i - 1; j++) {  
                System.out.print(" ");
            }
            // Loop to print stars with spaces in between
            for (int j = 0; j <= i; j++) {  
                System.out.print("* ");
            }
            System.out.println();  // Move to the next line
        }

        // Lower half of the diamond (excluding middle row)
        for (int i = 0; i < row; i++) {  
            // Loop to print spaces before stars
            for (int j = 0; j <= i - 1; j++) {  
                System.out.print(" ");
            }
            // Loop to print stars with spaces in between
            for (int j = 0; j <= row - i - 1; j++) {  
                System.out.print("* ");
            }
            System.out.println();  // Move to the next line
        }
    }
}