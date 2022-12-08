package day43_Abstraction.car;

public final class Audi extends Car{

    public Audi(String model, String colour, int year, double price) {
        super("Audi", model, colour, year, price);
    }

    public void start() {
        System.out.println("Push the start button");
    }

    public void autoPark(){
        System.out.println(getBrand() + getModel() + " has auto park feature.");
    }
}
