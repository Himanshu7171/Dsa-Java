package BasicCode.StringDsa;

public class ReverseString {

    public static void main(String[] args) {
        
        String s = "hello";
        char [] arr = s.toCharArray();
        String rev = "";


        for (int i = arr.length - 1; i>= 0; i--) {
            rev += arr[i];
        }
        System.out.println(" reversed String "+ rev);
    }
}
