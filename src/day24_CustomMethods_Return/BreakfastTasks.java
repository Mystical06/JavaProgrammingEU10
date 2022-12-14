package day24_CustomMethods_Return;

import java.util.Arrays;

public class BreakfastTasks {
    public static void main(String[] args) {


        initials("wooden","spoon");

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        domain("wooden.spoon@cydeo.com");

        System.out.println("====================================================================");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

        for (String email : emails) {
            domain(email);

        }
        System.out.println("------------------------------------------------------------------------");

        nameOfMonths(11);


        System.out.println("****************************************************************************");

        System.out.println(initials("Nevzat Talha Özcan"));


    }

    public static void initials(String firstName, String lastName){
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial=initial.toUpperCase();
        System.out.println(initial);
    }

    public static void domain(String email){
        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain: "+ domain);
    }

    public static void nameOfMonths(int number){
        String name="";

        if (number>=1 && number<=12){
            name= (number==1)? "Jan":(number==2)?"Feb" : (number==3)?"Mar": (number==4)?"April" :(number==5)?"May"
                    :(number==6)?"June": (number==7)?"July" : (number==8)?"Aug" :(number==9)?"Sep":(number==10)?"Oct"
                    :(number==11)?"Nov": "Dec";
        }else {
            name="Invalid";
        }
        System.out.println("Month Name: " + name);
    }




    public static String initials(String fullName){

        String initials = "";

        for (String each : fullName.split(" ")) {

            initials += each.charAt(0) + ".";

        }

        return initials;
    }







}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has
 */