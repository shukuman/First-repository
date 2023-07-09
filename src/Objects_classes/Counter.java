package Objects_classes;

public class Counter {
    static int count = 1;

    public static void invokeCounter() {
        count++;
        System.out.println("Текущее значение счётчика: " + count);
    }
}
