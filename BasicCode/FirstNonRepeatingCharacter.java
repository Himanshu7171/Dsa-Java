package BasicCode;

public class FirstNonRepeatingCharacter {
    public static char firstNonRepeating(String s) {
    int[] freq = new int[256]; // Array to store character frequencies

    // Step 1: Count occurrences of each character
    for (int i = 0; i < s.length(); i++) {
        freq[s.charAt(i)]++; // Increment frequency count
    }

    // Step 2: Find first character with frequency 1
    for (int i = 0; i < s.length(); i++) {
        if (freq[s.charAt(i)] == 1) {
            return s.charAt(i); // Return first non-repeating character
        }
    }

    return '_'; // Return '_' if no unique character is found
}

public static void main(String[] args) {
    String str = "aabbccdef";
    char result = firstNonRepeating(str);
    System.out.println("First Non-Repeating Character: " + result);
}
}