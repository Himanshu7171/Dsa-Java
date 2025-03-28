 package BasicCode;
 
public class SquareRootBinarySearch {
  // Function to find the square root using Binary Search
  public static int findSquareRoot(int x) {
    if (x == 0 || x == 1) {
        return x;
    }

    int low = 1, high = x, ans = 0;
    
    while (low <= high) {
        int mid = low + (high - low) / 2;
        long square = (long) mid * mid; // Use long to prevent overflow

        if (square == x) {
            return mid; // Found exact square root
        } else if (square < x) {
            ans = mid; // Store possible answer
            low = mid + 1; // Move right
        } else {
            high = mid - 1; // Move left
        }
    }
    return ans; // Return the integer square root
}
public static void main(String[] args) {
    int number = 37;
    System.out.println("Integer Square Root of " + number + " is: " + findSquareRoot(number));
}
}
