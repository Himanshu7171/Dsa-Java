package BasicCode;
public class prime  {

     public static void main(String[] args) {
        
        int num = 7 ;

        boolean isprime = true ;

        if( num <= 1 ){
            isprime = false ;
     }else{
        for( int i = 2 ; i <= num / 2 ; i++ ){
            if (num % i == 0  ){
                isprime = false ;
              break ;

            }
        
        }

     }

     if( isprime ){
        System.out.println(num + " is prime Number ");
     }else{
        System.out.println(num + " is not prime number ");
     }
    
     

    }   
    
 }