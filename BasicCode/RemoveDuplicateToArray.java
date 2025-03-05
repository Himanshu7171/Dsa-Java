package BasicCode;

import java.util.Arrays;

public class RemoveDuplicateToArray {

    public static int duplicateElement(int arr[]) {
        // Arrays method to sort
        Arrays.sort(arr);

        // loop form 0 to array length and minus 1
        for (int i = 0; i < arr.length - 1; i++) {
            // condition arr of i == i + 1
            if (arr[i] == arr[i + 1]) {
                // return duplicate arr
                return arr[i];

            }
        }

        // should never rech here
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 42, 2, 2, 5 };

        System.out.println(" Duplicate Array :" + duplicateElement(arr));
    }
}
