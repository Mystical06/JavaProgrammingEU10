package day43_Abstraction.car;

public class CarShop {

    public static void main(String[] args) {
    //    Car car1 = new Car("Cydeo", "25", "Blue", 2022, 100000);
        // We can not create object from Abstract class as abstract class is not concrete.

        Honda honda = new Honda("Honda", "Accord", "Black", 2019, 30000);
        Audi audi = new Audi("Q7", "Blue", 2020, 45000);
        Tesla tesla = new Tesla("Model 3", "White", 2021, 60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("-------------------------------------------------------------------");

        honda.setColour("Red");
        audi.setColour("Pink");
        tesla.setColour("Green");

        honda.setPrice(25000);
        audi.setPrice(40000);
        tesla.setPrice(55000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

    }

}
