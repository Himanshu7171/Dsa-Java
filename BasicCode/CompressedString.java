package BasicCode;

public class CompressedString {
    public String compressString(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Append the last character and its count
        compressed.append(s.charAt(s.length() - 1)).append(count);

        return compressed.toString();
    }

    public static void main(String[] args) {
        CompressedString sol = new CompressedString();
        String input = "aabbbcc";
        System.out.println(sol.compressString(input));  
    }
}