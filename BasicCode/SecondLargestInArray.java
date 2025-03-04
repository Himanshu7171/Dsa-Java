package BasicCode;

import java.util.Arrays;

public class SecondLargestInArray {

    public static int secondlargest(int arr[]) {
        if (arr.length < 2) {
            System.out.println(" Array must have at least two element ");
            return -1;

        }

        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstmax) {
                secondmax = firstmax;
                firstmax = num;

            } else if (num > secondmax && num < firstmax) {
                secondmax = num;

            }

        }
        if(secondmax == Integer.MIN_VALUE){
            return - 1;

        }else{
            return secondmax ;

        }

    }

    public static void main (String [] args){
        int arr [] = { 1,3,5,22,45,2};
        

        System.out.println("Second largest Array  Elment :"+ secondlargest(arr) );
    }
}
