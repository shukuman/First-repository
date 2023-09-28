package Inheritance.Animal.animal3;

public class Animal3Test {
    public static void main(String[] args) {
        Animal3 a = new Animal3("Manny", 8);
        Cat3 c = new Cat3("Barsik", 5);
        Dog3 d = new Dog3("Mailo", 3);

        a.sound();
        c.sound();
        d.sound();
    }
}
