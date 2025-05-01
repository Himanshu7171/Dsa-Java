 package BasicCode.StringDsa;
 
public class TrimString {
    public static void main(String[] args) {
        String original = "   Hello World!   ";
        System.out.println("Original: [" + original + "]");

        String trimmed = original.trim();
        System.out.println("Trimmed:  [" + trimmed + "]");
    } 
}
