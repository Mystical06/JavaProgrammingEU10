package day35_Encapsulation.encapsulation;

public class Person {

    public String name;
    public int age;

    public Person(String name, int age) {

        if (name.isEmpty()){
            System.err.println("Invalid name: " + name);
            System.exit(0);
        }
        this.name = name;

        if (age<=0 || age>150){
            System.err.println("invalid age : " + age);
            System.exit(0);
        }
        this.age = age;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


/*public String getName(){
        return name;
    }


    public void setName( String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge ( int age){
        if (age <=0){
            System.err.println("Invalid age: " + age);
            System.exit(0);
        }

        if (age>150){
            System.err.println("Invalid age: " + age);
            System.exit(0);
        }
        this.age=age;


    }

     */




}
