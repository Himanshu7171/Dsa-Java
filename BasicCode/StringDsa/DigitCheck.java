package BasicCode.StringDsa;

public class DigitCheck {
    public boolean containsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        DigitCheck checker = new DigitCheck();

        String input = "12345";
        System.out.println("Contains only digits: " + checker.containsOnlyDigits(input)); // true

        input = "123a5";
        System.out.println("Contains only digits: " + checker.containsOnlyDigits(input)); // false
    }

}
