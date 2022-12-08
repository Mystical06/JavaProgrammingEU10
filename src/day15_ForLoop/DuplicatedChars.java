package day15_ForLoop;

public class DuplicatedChars {
    public static void main(String[] args) {

        String str= "AAAABBBCCCCBCD";
        String result= "";

        for (int i = 0; i < str.length(); i++) {

            String ch= ""+ str.charAt(i);
            if (!result.contains(ch)) {

                result += ch;
            }


        }
        System.out.println(result);
    }
}
