 package BasicCode.StringDsa;

public class SubsequenceCheck {
// Function to check if 's' is a subsequence of 't'
public static boolean isSubsequence(String s, String t) {
    int i = 0, j = 0;

    // Iterate through both strings
    while (i < s.length() && j < t.length()) {
        if (s.charAt(i) == t.charAt(j)) {
            i++; // Move to the next character in s
        }
        j++; // Always move to the next character in t
    }

    // If we have matched all characters of s, return true
    return i == s.length();
}

public static void main(String[] args) {
    String s = "abc";
    String t = "ahbgdc";

    boolean result = isSubsequence(s, t);

    System.out.println("Is s a subsequence of t? " + result);  // Output: true

    // Another test case
    String s2 = "axc";
    String t2 = "ahbgdc";

    boolean result2 = isSubsequence(s2, t2);

    System.out.println("Is s2 a subsequence of t2? " + result2);  // Output: false
}
}
