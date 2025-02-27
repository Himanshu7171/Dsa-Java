package BasicCode; 
public class FibanonciSeries {

    public static void main(String[] args) {
        int num1 = 0 , num2 = 1 ;
        int next = 0 ;
        System.err.println("This is fibanonaci series which means two number additon is the next NUmber");
        System.out.print(num1 + " " + num2 );
      
       
        for (int i = 0; i < 8; i++) {
            next = num1 + num2 ;
            System.out.print(" " + next);
            num1 = num2;
            num2 = next ;
        }


    }
}
