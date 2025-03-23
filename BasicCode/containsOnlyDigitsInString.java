
package BasicCode;
public class containsOnlyDigitsInString {

    public static boolean iscontatindigit(String s){

        if( s == null || s.isEmpty()) return false ;

        for (char c : s.toCharArray()) {
            if(!Character.isDigit(c)){

            
            return false;
            }
            
        } 
        return true;

    
    }
    public static void main(String[] args) {
        
        System.out.println(iscontatindigit("1234"));
        System.out.println(iscontatindigit("abc123"));
    }
}

