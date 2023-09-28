package Inheritance.Animal.animal2;

public class Animal2Test {
    public static void main(String[] args) {
        Animal2 a = new Animal2();
        a.name = "Jerry";
        a.eat();

        Cat2 c = new Cat2();
        c.name = "Tom";
        c.eat();

        Dog2 d = new Dog2();
        d.name = "Rex";
        d.eat();
    }
}
