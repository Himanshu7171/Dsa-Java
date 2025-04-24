package BasicCode ;

public class insertionSortEx1 {
    public void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;

            // Move elements that are greater than current to one position ahead
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        insertionSortEx1 sol = new insertionSortEx1();
        int[] nums = {5, 3, 4, 1, 2};

        sol.insertionSort(nums);

        System.out.print("Sorted array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}
