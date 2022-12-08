package day08_IfStatements;

import java.util.Scanner;

public class IfElsePractice {
    public static void main(String[] args) {

        /*
        String word = "Cydeo School";

        int c= word.indexOf("C");
        int o= word.indexOf("o");

       String word2= word.substring(c,o+1);
        System.out.println("word2 = " + word2);

         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your email address");

        String email=scan.next();
        System.out.println("email = " + email);

        String result= email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        String domainChange= email.replace(result,"cydeo");
        System.out.println("domainChange = " + domainChange);







































        }



    }

