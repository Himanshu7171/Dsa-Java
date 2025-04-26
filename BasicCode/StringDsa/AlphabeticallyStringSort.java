package BasicCode.StringDsa;

public class AlphabeticallyStringSort {
    public static void main(String[] args) {
        // Step 1: Define the array
        String[] arr = {"banana", "apple", "cherry"};

        // Step 2: Bubble Sort logic
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                // compareTo() returns > 0 if arr[j] > arr[j+1]
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    // swap arr[j] and arr[j+1]
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
         // Step 3: Print the sorted array
         System.out.println("Sorted array:");
         for (String s : arr) {
             System.out.println(s);
         }
     }
 
}
