package day43_Abstraction.car;

public final class Honda extends Car{

    public Honda(String brand, String model, String colour, int year, double price) {
        super(brand, model, colour, year, price);
    }


    public void start() {
        System.out.println("Twist the key to ignition");
    }


}
