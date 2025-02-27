package BasicCode;

import java.util.Arrays;

public class SortedArrayBubbles {

    public static void Sortarray(int arr[]) {

        int n = arr.length;
        boolean swapped;
        // loop is started from o to n -1 means to check the greater number
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
        
        // check the number if its greater its shifted to in ascendiing order 
            for (int j = 0; j < n - i - 1; j++) {
                // compares the value 
                if (arr[j] > arr[j + 1]) {
                
                
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;

                }

            }
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 24, 5, 6, 63, 5 };

        System.out.println(" original array " + Arrays.toString(arr));
        ;

        Sortarray(arr);

        System.out.println(" Sorted Array " + Arrays.toString(arr));
    }
}
