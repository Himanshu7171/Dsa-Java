package BasicCode ;
public class RemoveDuplicates {
  // Bubble Sort to sort the array manually
  public static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) { // Swap if needed
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

// Function to remove duplicates
public static int removeDuplicates(int[] arr) {
    int n = arr.length;
    if (n == 0) return 0;

    bubbleSort(arr); // Manually sort the array

    int j = 0; // Pointer for the next unique element
    for (int i = 1; i < n; i++) {
        if (arr[i] != arr[j]) { // If new unique element found
            j++;
            arr[j] = arr[i]; // Store unique element
        }
    }
    return j + 1; // Number of unique elements
}

public static void main(String[] args) {
    int[] nums = {4, 2, 3, 1, 1, 2, 4, 5};
    int newLength = removeDuplicates(nums);

    // Print unique elements
    System.out.print("Array after removing duplicates: ");
    for (int i = 0; i < newLength; i++) {
        System.out.print(nums[i] + " ");
    }
}

}
