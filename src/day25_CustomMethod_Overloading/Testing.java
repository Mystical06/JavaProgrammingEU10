package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class Testing {

    //		1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
    public static int[] addInteger( int[] array, int element){
        int[] result = new int[array.length+1];

        for (int i = 0; i < array.length; i++) {
            result[i]+=array[i];
        }
        result[result.length-1]=element;
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        arr = addInteger(arr, 5);

        System.out.println(Arrays.toString(arr));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");


        int[] intArray= {0,1,2,3,4,5,6};

        intArray= removeElement(intArray,4);
        System.out.println(Arrays.toString(intArray));


    }


    public static int[] removeElement(int[] array, int index) {

        int[] result= new int[array.length-1];

        int j=0;
        for (int i=0; i< array.length; i++) {
            if (i==index){
                continue;
            }
            result[j++]=array[i];
        }
        return result;
    }


}