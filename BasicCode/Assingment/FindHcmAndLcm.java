package BasicCode.Assingment;

public class FindHcmAndLcm {
 public static  int Hcf( int a , int b ){
    while( b != 0){
        int temp = b ;
        b = a % b ;
        a = temp ;
    }
    return a ;

    }

    public static  int lcm ( int a , int b , int c ){
        return  ( a *b )/ c ;
    }
 
public static void main ( String [] args){
 int num  = 344  , num1 = 343 ;

 int hcf = Hcf(num, num1);
 int lcm = lcm(num, num1, hcf);

 System.out.println("Hcf " + num + " and " + num1 + " is " + hcf);
 System.out.println("lcm " + num + " and " + num1 + " is " + lcm);

}
}
