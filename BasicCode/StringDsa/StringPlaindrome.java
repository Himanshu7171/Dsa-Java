package BasicCode.StringDsa;

public class StringPlaindrome {

    public static boolean isplaindrome(String str ){
    // to check the string in all lower case 
       str =  str.replaceAll("//s+", " ").toLowerCase();

       // start from left and end form right in string with backward 
       int left = 0 ;
       int right = str.length() -1 ;

     // in loops right to left 
       while (left<right) {
        // check all char is same or not from all string 

       if( str.charAt(left)!= str.charAt(right)){
        // false condition 
        return false;

       }
       // in loop left to right 
       left++;
       right--;


        
       }
       return true;

    }
    public static void main(String[] args) {
        String  str = "Namakn";

        if(isplaindrome(str))
        System.out.println(str+ " Is palindrome ");
    else{
        System.out.println(str + " is not palindrome ");
    }
}
}
