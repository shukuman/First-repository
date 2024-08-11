package Interface.Birds;

public class Test {
    public static void main(String[] args) {
        Colibri colibri = new Colibri();
        colibri.fly();

        Swan swan = new Swan();
        swan.swim();

        Duck duck = new Duck();
        duck.fly();
        duck.swim();

        Flyable[] array1 = new Flyable[] {duck, colibri};
        for (Flyable flying : array1) {
            flying.fly();
        }

        Swimable[] array2 = new Swimable[] {duck, swan};
        for (Swimable swimming : array2) {
            swimming.swim();
        }
    }
}
