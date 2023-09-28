package Inheritance.Animal.animal3;

public class Cat3 extends Animal3 {
    public Cat3(String name, int age) {
        super(name, age);
    }
    @Override
    public void sound() {
        System.out.println("Мяу-Мяу");
    }
}
