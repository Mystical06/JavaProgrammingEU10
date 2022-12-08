package day44_OOP_Abstraction_Continue.animal;

public final class Cat extends Animal implements Playable{

    public Cat(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName()+  " is eating biryani");
    }

    public void meow (){
        System.out.println(getName() + "is meowing");
    }

    @Override
    public void play() {

    }
}
