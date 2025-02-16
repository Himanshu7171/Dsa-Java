package BasicCode.Assingment;

import java.util.Scanner;

public class MulTableif2 {
public static void main (String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number to Print the Table");
    int table = sc.nextInt(); 

    for( int i = 2 ; i <= 10 ; i++ ){
        
        System.out.println(table + "*" + i + " ="+ (table * i)  );

    }
}
}
