package BasicCode;

public class MoveZeroToArray {
   public void zeroindex(int [] arr){
    int nonzero = 0 ;

    for(int i = 0 ; i < arr.length ; i++){
        if(arr[i] != 0 ){
            int temp = arr[i];
            arr[i] = arr[nonzero];
            arr[nonzero] = temp;


            nonzero++;

        }
    }
   }
   public static void main(String[] args) {
    int arr[] = { 1,3,6,0,3,0,0,0,3,3,34};
    MoveZeroToArray sm = new MoveZeroToArray();
    sm.zeroindex(arr);

    for (int i : arr) {
        System.out.print(i+" ");
    }
   }
   

}
