package BasicCode.StringDsa;

public class countvowelstring {

    public static int countvowel(String str ){
        int  count = 0 ;

         str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == 'a' || ch == 'e'||ch == 'o'|| ch == 'i'|| ch == 'u'){
              count++;

            }

        }
        return count;

    }
    public static void main(String[] args) {
        String  str = "education";
        int countvowel =  countvowel(str);

        System.out.println(countvowel);
    }
}
