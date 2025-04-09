package BasicCode.ArrayDsa;

public class DivideTwoInteger {

    public int divide(int dividend, int divisor) {
        // Edge case: overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Use long to avoid overflow and get absolute values
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int result = 0;

        while (a >= b) {
            long temp = b;
            int multiple = 1;

            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            a -= temp;
            result += multiple;
        }

        // Apply the correct sign
        return ((dividend > 0) == (divisor > 0)) ? result : -result;
    }

    // Example usage
    public static void main(String[] args) {
        DivideTwoInteger obj = new DivideTwoInteger();
        System.out.println(obj.divide(10, 3));   // Output: 3
        System.out.println(obj.divide(7, -3));   // Output: -2
    }

}
