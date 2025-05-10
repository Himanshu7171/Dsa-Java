package BasiCode.ArrayDsa ;

public class SumofArray {

    public static void main(String[] args) {
        
        int [] arr = new int[5];
        arr[0] = 11 ;
        arr[1] = 15 ;
        arr[2] = 14 ;
        arr[3] = 13 ;
        arr[4] = 12 ;
        int sum = 0;


        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println(sum);

    }
}
