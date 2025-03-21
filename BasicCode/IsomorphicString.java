package BasicCode;

import java.util.HashMap;

public class IsomorphicString {
 public boolean isIsomorphic(String s, String t) {
    // If lengths are different, they cannot be isomorphic
   if (s.length() != t.length()) return false;

   // Two HashMaps to store character mappings from s -> t and t -> s
   HashMap<Character, Character> map1 = new HashMap<>(); // s to t mapping
   HashMap<Character, Character> map2 = new HashMap<>(); // t to s mapping

   // Iterate through each character of both strings
   for (int i = 0; i < s.length(); i++) {
       char c1 = s.charAt(i); // Character from s
       char c2 = t.charAt(i); // Corresponding character from t

       // If c1 is already mapped, but mapped to a different character, return false
       if (map1.containsKey(c1) && map1.get(c1) != c2) return false;
       // If c2 is already mapped, but mapped to a different character, return false
       if (map2.containsKey(c2) && map2.get(c2) != c1) return false;

       // Store the new mapping from c1 -> c2 and c2 -> c1
       map1.put(c1, c2);
       map2.put(c2, c1);
   }

   // If all character mappings are valid, return true
   return true;
}

public static void main(String[] args) {
   IsomorphicString sol = new IsomorphicString();
   
   // Test cases
   System.out.println(sol.isIsomorphic("egg", "add"));   // true (e -> a, g -> d)
   System.out.println(sol.isIsomorphic("foo", "bar"));   // false (o maps to different letters)
   System.out.println(sol.isIsomorphic("paper", "title"));// true (consistent mapping)
}
}