package day38_Inharitance.carpackage;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2020, 20000, "Gray", 123456);
        System.out.println(toyota);

        Tesla tesla = new Tesla("Model S", 2022, 94990, "Red", 0);
        System.out.println(tesla);
        BMW bmw = new BMW("X5", 2020, 67350, "black", 12000);
        System.out.println(bmw);


        toyota.start();
        tesla.start();
        bmw.start();











    }
}
