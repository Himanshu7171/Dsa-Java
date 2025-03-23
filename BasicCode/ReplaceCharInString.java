package BasicCode;

public class ReplaceCharInString {
    public static String replaceCharacter(String s, char oldChar, char newChar) {
        // Check if the string is null or empty
        if (s == null || s.isEmpty()) return s;

        // Replace occurrences of oldChar with newChar
        return s.replace(oldChar, newChar);
    }
    public static void main(String[] args) {
        System.out.println(replaceCharacter("apple", 'a', '@')); 
        System.out.println(replaceCharacter("banana", 'a', '*')); 
        System.out.println(replaceCharacter("hello", 'l', '1'));  
        System.out.println(replaceCharacter("java", 'x', 'y')); 
    }
}
