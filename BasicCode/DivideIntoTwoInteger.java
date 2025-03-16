package BasicCode ;

public class DivideIntoTwoInteger {
    public static int divide(int dividend, int divisor) {
        // Handle edge case where division overflows (e.g., -2^31 / -1 = 2^31)
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine sign: XOR to check if signs are different
        boolean isNegative = (dividend < 0) ^ (divisor < 0);

        // Convert to positive values using long to handle overflow cases
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int quotient = 0;

        // Subtract using bitwise shifting for optimization
        while (a >= b) {
            long tempDivisor = b;
            int multiple = 1;

            // Double divisor (left shift) until it exceeds the dividend
            while ((tempDivisor << 1) <= a) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }

            // Subtract the maximum found divisor and update quotient
            a -= tempDivisor;
            quotient += multiple;
        }

        // Apply the correct sign and return
        return isNegative ? -quotient : quotient;
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 3));  // Output: 3
        System.out.println(divide(7, -3));  // Output: -2
        System.out.println(divide(-2147483648, -1)); // Output: 2147483647 (clamped)
    }
}


