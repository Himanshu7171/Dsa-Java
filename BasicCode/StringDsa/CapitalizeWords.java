package BasicCode.StringDsa;

public class CapitalizeWords {

    public static String capitalFirstWordString(String str) {
        if (str == null || str.isEmpty()) return str;

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))  // Capitalize first letter
                      .append(word.substring(1))                     // Append rest of the word
                      .append(" ");                                  // Add space after each word
            }
        }

        return result.toString().trim();  // Remove last space
    }

    public static void main(String[] args) {
        String input = "hello world java programming";
        String output = capitalFirstWordString(input);
        System.out.println("Output: " + output);
    }
}

