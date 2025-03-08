package BasicCode;

public class FirstNonRepeatingEelementInArray {

    public static int firstnonrepeating (int [] arr){
        int n = arr.length;
        int[] freq = new int[100001]; // Assuming numbers are in range [0, 100000]
        int[] order = new int[n]; // Stores the order of elements
        int index = 0;

        // Count occurrences and store order of appearance
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            freq[num]++;
            if (freq[num] == 1) { // First appearance
                order[index++] = num;
            }
        }

        // Find the first element with frequency 1
        for (int i = 0; i < index; i++) {
            if (freq[order[i]] == 1) {
                return order[i];
            }
        }

        return -1; // No non-repeating element found
    }
   public static void main(String[] args) {
    int [] arr = { 4, 5, 1, 2, 0, 4, 5, 2};

 System.out.println(" First non Repeating Element "+ firstnonrepeating(arr));
   }
}
