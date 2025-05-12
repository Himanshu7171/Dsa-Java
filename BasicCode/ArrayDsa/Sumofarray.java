package BasicCode.ArrayDsa;

public class Sumofarray {

    public static int sumarray( int [] arr){
        int sum = 0 ;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
    

        }
        return sum;

    }
    public static void main(String[] args) {
        int[] arr = { 2,3,4,5,6};
       int totalsum = sumarray(arr);
     System.out.println(totalsum);
    }
}
