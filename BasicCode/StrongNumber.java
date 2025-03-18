package BasicCode;

import java.util.Scanner;

public class StrongNumber {

    public static int factorial (int n){
        int fact = 1 ;

        for(int i = 1 ; i <= n ; i++){
            fact *=i;

        }
        return fact ;
    }
    public static boolean isStrong(int num ){
        int Originalnum = num;
        int sum = 0 ;

       while (num > 0) {
        int digit = num % 10 ;
        sum += factorial(digit);
        num/= 10;

        
       }
       return sum == Originalnum;

    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the Number to Get It Is Strong number or What :");

        int num = sc.nextInt();

        if(isStrong(num)){
            System.out.println(num+"is Strong Number ");
        }else{
            System.out.println(num+" Is not Storng Number ");
        }
    }
}
