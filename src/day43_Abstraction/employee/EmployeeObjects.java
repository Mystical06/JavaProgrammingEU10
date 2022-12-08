package day43_Abstraction.employee;

public class EmployeeObjects {
    public static void main(String[] args) {

        Tester tester = new Tester("Mustafa", 36,'M',123, "SDET",38000);
        Developer developer = new Developer("Josh", 38, 'M', 321, "Developer", 58000);
        Teacher teacher = new Teacher("Angel",28,'F',22,"English Teacher",85000.00);
        Driver driver = new Driver("John",34,'M',42,"Lyft Driver",75000.00);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("-----------------------------------");
        developer.work();
        developer.sleep();
        //developer.bugReport();
        developer.eat();
        developer.unitTest();

        System.out.println("-----------------------------------");

        teacher.work();
        teacher.sleep();
        teacher.eat();








    }
}
