package BasicCode;

import java.util.Scanner;

public class VowelConsonentCountInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a Strig  to check Vowels And Consonent : ");

        // to get user frm string 
        String str = sc.nextLine();

        // to adjust the spaces
        str.toLowerCase();

        // to store vowels and consonent 
        int vowels = 0 , consonent = 0  ;

        // loop to length of string 
        for (int i = 0; i < str.length(); i++) {
        // to convert character from string
            char ch = str.charAt(i);
            // condition to for check vowels and consonent 
            if(Character.isLetter(ch)){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;

                }else{
                    consonent++;
                }
            }
            
        }
        System.out.println(" vowels is :"+ vowels);
        System.out.println(" consonent is :" +consonent);
    }
}
