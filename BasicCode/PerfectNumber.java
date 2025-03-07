package BasicCode;


public class PerfectNumber {

    public static boolean isperfect(int  n){

        int sum = 0 ;

        for (int i = 1; i < n; i++) {
            if(n % i ==0 ){
                sum += i;

            }
        }
        return sum == n ;

    }
    public static void main(String[] args) {
        int n = 2 ;
        if(isperfect(n)){
            System.out.println(n+" :perfect number");
        }else{
            System.out.println(n+" :is not perfect number ");
        }
    }
}
