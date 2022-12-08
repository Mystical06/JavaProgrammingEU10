package day43_Abstraction.car;

public abstract class Car {
    private final String brand, model;
    private String colour;
    private final int year;
    private double price;

    public Car(String brand, String model, String colour, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColour(colour);
        if( year < 1886){
            throw new RuntimeException("Invalid year: " + year);
        }
        this.year = year;
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            throw new RuntimeException("Invalid price: "+ price);
        }
        this.price = price;
    }

    public void stop (){
        System.out.println("Press the brake");
    }

    public abstract void start ();

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
