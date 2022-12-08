package day44_OOP_Abstraction_Continue.animal;

public final class Dog extends Animal implements Playable {

    public Dog(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats Pizza");
    }

    public final void bark(){

    }

    @Override

    public void play(){
        System.out.println(getName() + " is playing with ball.");
    }

}
