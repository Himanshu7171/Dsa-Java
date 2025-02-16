package BasicCode.Assingment;

public class LeapYearFind {

    public static void main(String[] args) {
         
        int year = 2003 ;


        
        if( (year % 4 == 0 && year % 100 != 0 ) ||( year % 400 == 0)) {
             System.out.println(year + " is Leap Year ");
        }else{
            System.out.println(" Is not leap Year "+ year);
        }
    }
}
