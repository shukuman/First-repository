package Inheritance.Animal.animal3;

public class Dog3 extends Animal3 {
    public Dog3(String name, int age) {
        super(name, age);
    }
    @Override
    public void sound() {
        System.out.println("Гав-Гав");
    }
}