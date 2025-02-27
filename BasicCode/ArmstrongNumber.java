package BasicCode;
 
  //  Armstrong Number Is neagtive 1³ + 5³ + 3³ = 1 + 125 + 27 = 153 ✅ (It is an Armstrong number)
public class ArmstrongNumber {

    public  static boolean isarmstrong(int num ){
        // to store the num
        int originalnum = num;
        // to store sum 
        int sum = 0 ;
        // to store the legth of num in int 
        int numdigit = String.valueOf(num).length();
      
        while ( num > 0 ){
        // to get remainder of num 
        int digit = num % 10 ;
        // to get power of each number 
        sum += Math.pow(digit, numdigit);
        // to check the number is negative 
        num /= 10;

        }
      // compares the number of condition to orginalnumber 
        return sum == originalnum;

    }
  public static void main(String[] args) {
     if( isarmstrong(153)){
        System.out.println(" is Armstrong number ");
     }else{
        System.out.println(" Is Not Armstrong Number ");
     }
  }
}
