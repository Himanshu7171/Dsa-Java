package BasicCode;

public class StarPattern1 {
public static void main ( String [] args ){

    String s = "*";

//     for( int i = 1 ; i <= 10 ; i++ ){
//         for(int j = i ; j <= i ; j++ ){
//             System.out.print(s);
//         }
//         System.out.println();
//     }
   
// }
   
   for (int i = 1; i <= 10; i++) {  // Controls the number of rows
            for (int j = 1; j <= i; j++) {  // Prints stars in increasing order
                System.out.print(s);
            }
            System.out.println(); // Moves to the next line after printing stars
        }
    }
}


