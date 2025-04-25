package BasicCode;

public class SelectionSortIndex {

     public static void selectsort(int  []arr){
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // Swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
       
  }
  public static  void printarr(int [] arr){
    
    for (int num : arr) {
        System.out.println( num + " ");
    }
    System.out.println();
  }  
     public static void main(String[] args) {
        int arr [] = { 12,3,42,4,23,4};
          selectsort(arr);
        
        
         System.out.println();
         printarr(arr);
     }
}
