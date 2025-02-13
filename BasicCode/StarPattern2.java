
package BasicCode ;

public class StarPattern2 {

public static void main(String[] args) {
    // limit of code is 5 
    int n = 5 ;

    // first loop is to 5 to 1 with decrement
    for(int i = n ; i >= 1; i-- ){
        for(int j = 1 ; j <= i ; j++){
    // second loop is to 1 to 5 with increment 
            System.out.print("* ");
        }
        System.out.println();
    }

}
}
