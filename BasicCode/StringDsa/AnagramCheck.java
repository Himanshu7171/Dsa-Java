package BasicCode.StringDsa;

import java.util.Arrays;

public class AnagramCheck {
    // method thah checks a string is anagram or not 

    public static boolean anagramis( String str1 , String str2){

        // its condition that str1 length is not eaqual to str2 if its return false
        if(str1.length()!= str2.length()) return false;

        // its to convert the string to to char array to check the anagrams 
         char arr [] =str1.toCharArray();
         char arr1[] = str2.toCharArray();
        // to sort the char array 
        Arrays.sort(arr);
        Arrays.sort(arr1);
        // check the arrays char is eaqual and same or not that defines the string is anagram 
        Arrays.equals(arr, arr1);
         return true;
        
    }
    public static void main(String[] args) {
        String st1 = " tac ";
        String st2 = " cat ";
        if(anagramis(st1, st2)){
            System.out.println( st1 +"is Anagram ");
        }else{
            System.out.println(" not anagram ");
        }
    }
}
