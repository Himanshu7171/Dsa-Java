package BasicCode;

public class LargestNumberArray{

    public static void main ( String [] args ){
        int largest [] = { 1,2,3,4,5,6,10} ;
        int max = largest[0] ;

        for ( int i = 0 ; i < largest.length; i++ ){
            if( max <  largest[i]){
                max = largest[i];

            }

        }
        System.out.println(" Ther Max Number of Array :" + max);
    }
}
