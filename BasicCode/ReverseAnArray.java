package BasicCode;

import java.util.Arrays;

public class ReverseAnArray {

    public static void reversearray(int []arr){
        int start = 0 , end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] =temp;


            start++ ;
            end--;

        }
    }


    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,8,9,10};
     
        System.out.println("Orginal array : "+Arrays.toString(arr));
       reversearray(arr);
        System.out.println(" Reversed Array : "+ Arrays.toString(arr) );
        
    }
}
