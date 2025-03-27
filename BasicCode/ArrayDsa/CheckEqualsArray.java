package BasicCode.ArrayDsa;

import java.util.Arrays;

public class CheckEqualsArray {

    public static boolean equalsarray( int [] arr1 , int [] arr2){

        if(arr1.equals(arr2)){
            System.out.println(" array is not equal");
            return false;

        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if( arr1  == arr2 ){
                return true;
            }
        }

          return true;

    }

    public static void main(String[] args) {
        int arr [] = {  1,2,3,4,5};
        int arr0 [] = { 5,4,3,2,1};

       if(equalsarray(arr, arr0)){
        System.out.println(" Both Arrays Are equal");
       }else{
        System.out.println(" Arrays Are not Equal");
       }

    }
}
