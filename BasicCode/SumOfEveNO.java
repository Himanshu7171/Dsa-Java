package BasicCode ;

public class SumOfEveNO {
public static void main(String[] args) {
    
    int sum = 0 ;

    for (int i = 0; i <= 50; i++) {
        if( i % 2 == 0){
            sum += i;

        }
    }
      System.out.println(" Sum of All even no is " + sum);
}
}
