package day15_ForLoop;

public class ReverseJava {
    public static void main(String[] args) {

        String value= "Java";
        String reverse= "";

        for (int i = value.length()-1; i >=0; i--) {
            reverse+=value.charAt(i);


        }
        System.out.println(reverse);

    }
}
