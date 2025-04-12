package BasicCode.StringDsa;

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        // If lengths are not equal, they can't be isomorphic
        if (s.length() != t.length()) return false;

        // Maps to store character mappings from s to t and t to s
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        // Loop through both strings simultaneously
        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i); // character from s
            char charT = t.charAt(i); // character from t

            // Check s -> t mapping
            if (mapST.containsKey(charS)) {
                // If mapping doesn't match the current character in t, not isomorphic
                if (mapST.get(charS) != charT) {
                    return false;
                }
            } else {
                mapST.put(charS, charT); // create new mapping
            }

            // Check t -> s mapping (to avoid two chars in s mapping to same char in t)
            if (mapTS.containsKey(charT)) {
                if (mapTS.get(charT) != charS) {
                    return false;
                }
            } else {
                mapTS.put(charT, charS); // create reverse mapping
            }
        }

        // All characters matched correctly
        return true;
    }

    // Test the function
    public static void main(String[] args) {
        IsomorphicStrings iso = new IsomorphicStrings();

        String s = "egg";
        String t = "add";

        boolean result = iso.isIsomorphic(s, t);
        System.out.println("Isomorphic: " + result); // Output: true
    }
}
