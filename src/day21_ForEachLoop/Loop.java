package day21_ForEachLoop;

public class Loop {

    public static void main(String[] args) {

        String str="";

        for (int i = 1; i < 6; i++) {
             str += i + ",";

        }
        System.out.println(str.substring(0,str.length()-1));

        int array1[] = {1,2,3};
        int array2 [] = new int[5];

        array2=array1;

        for (int i : array2) {
            System.out.println(i);
        }









    }
}
