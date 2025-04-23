 package BasicCode ;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateString {

    public static String removeDuplicate(String str){
         // Use a TreeSet to remove duplicates and sort characters
        Set<Character> charSet = new TreeSet<>();
        
        for (char c : str.toCharArray()) {
            charSet.add(c);
        }
        
        // Build the result string
        StringBuilder result = new StringBuilder();
        for (char c : charSet) {
            result.append(c);
        }
        
        return result.toString();
    }
    public static void main(String[] args) {
        
        String input =  " aaddskshdkafa";
        String result = removeDuplicate(input);
        System.out.println(result);
    }
    }



