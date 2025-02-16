package BasicCode;

public class PyramidStarPatter {
    public static void main(String[] args) {
        // limit of 5 
    int n = 5 ;

// first loop is 1 to 5 
    for(int i =  1 ; i <= n ; i++){
// second loop is 1 to 5
        for(int j = i; j < n; j++ ){
       System.out.print(" ");
        }
// third loop is to 1 to 5 with logic of add of 3 
        for(int j = 1 ; j <= (2 * i - 1 ); j++){
            // print in same line 
            
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
