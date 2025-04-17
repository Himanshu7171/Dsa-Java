 package BasicCode.StringDsa;

public class isAnagram {
 // This method checks if two strings are anagrams of each other
    public static boolean isAnagram(String s, String t) {
        
        // First, let's do a quick check: if lengths are different, they can't be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // We'll use an array of size 26 for counting each letter (a-z)
        int[] letters = new int[26];

        // Now let's go through the first string and count how many times each letter appears
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            letters[ch - 'a']++;  // increase count for that letter
        }

        // Next, go through the second string and decrease the count for each letter
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            letters[ch - 'a']--;  // decrease count

            // If at any point the count goes below 0, that means extra letter in t
            if (letters[ch - 'a'] < 0) {
                return false;
            }
        }

        // If we reached here, that means everything matched properly
        return true;
    }

    public static void main(String[] args) {
        // Just trying out our function with an example
        String s = "anagram";
        String t = "nagaram";

        // Calling the method and showing result
        if (isAnagram(s, t)) {
            System.out.println("Yes, '" + s + "' and '" + t + "' are anagrams!");
        } else {
            System.out.println("Nope, '" + s + "' and '" + t + "' are not anagrams.");
        }
    }
}
