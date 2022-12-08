package day13_StringClass;

import java.util.Scanner;

public class MyInfo2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your age: ");
        int age= scan.nextInt();

        System.out.println("Please enter your gender: ");

        String gender=scan.next();
        scan.nextLine();

        System.out.println("Please enter your full name: ");
         String fullName = scan.nextLine();

        System.out.println("Please enter your phone number: ");

        long phone = scan.nextLong();

        System.out.println("Please enter your zip code: ");
        int zipCode= scan.nextInt();

        scan.nextLine();

        System.out.println("Please enter your school name: ");
        String schoolName= scan.nextLine();

        System.out.println("Please enter your city: ");
        String city = scan.nextLine();

        System.out.println("Please enter your state: ");
        String state = scan.next();

        System.out.println("Please enter your door number: ");
        int doorNo= scan.nextInt();
        scan.nextLine();

        System.out.println("Please enter your street: ");
        String street = scan.nextLine();

        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("fullName = " + fullName);
        System.out.println("phone = " + phone);
        System.out.println("zipCode = " + zipCode);
        System.out.println("schoolName = " + schoolName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("doorNo = " + doorNo);
        System.out.println("street = " + street);

        scan.close();









    }
}
