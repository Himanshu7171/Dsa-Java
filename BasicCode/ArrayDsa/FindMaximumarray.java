package BasicCode.ArrayDsa;

public class FindMaximumarray {

    public static int maxarray(int [] arr){
        int maxarray = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxarray){
                maxarray++;
            maxarray = arr[i];

            }
           

        }
        return maxarray ;
    }
    public static void main(String[] args) {
        int [] arr= { 12,345,5,538};
       int result = maxarray(arr);
System.out.println(result);
    }
}
