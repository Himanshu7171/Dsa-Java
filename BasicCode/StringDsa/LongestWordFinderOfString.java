package BasicCode.StringDsa;

public class LongestWordFinderOfString {

    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        // Correcting split method to handle multiple spaces properly
        String[] words = sentence.trim().split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox";
        String sentence1 = "Java is a powerful language";

        System.out.println("Longest word: " + findLongestWord(sentence));  // Output: "quick"
        System.out.println("Longest word: " + findLongestWord(sentence1)); // Output: "powerful"
    }
}
