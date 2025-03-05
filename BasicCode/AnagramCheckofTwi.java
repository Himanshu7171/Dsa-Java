package BasicCode;

import java.util.Arrays;

public class AnagramCheckofTwi {

    public static boolean isanagram(String s1 , String s2 ){

        if(s1.length() != s2.length()){
return false ;

        }

        char [] arr = s1.toCharArray();
        char[] arr1 = s2.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);

        return Arrays.equals(arr, arr1);


    }
    public static void main(String[] args) {
        String st1 = " listen ";
        String st2 = " silent ";

        if(isanagram(st1, st2)){
            System.out.println(st1 + "and" + st2 +"are anagram " );
        }else{
            System.out.println(st1 + "and"+ st2 + "are not anagram ");
        }
    }
}
