package BasicCode.StringDsa;

public class lengthOfLastWord {
    public int lengthOfLastWord1(String s) {
        // Remove leading and trailing spaces
        s = s.trim();
        
        // Split the string by one or more spaces
        String[] words = s.split(" ");
        
        // Get the last word
        String lastWord = words[words.length - 1];
        
        // Return the length of the last word
        return lastWord.length();
    }

    public static void main(String[] args) {
        lengthOfLastWord solution = new lengthOfLastWord();
        String s = "Hello World";
        System.out.println("Length of last word: " + solution.lengthOfLastWord1(s)); // Output: 5
    }
}

