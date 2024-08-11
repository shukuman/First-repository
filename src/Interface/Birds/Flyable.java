package Interface.Birds;

public interface Flyable {
    default void fly() {
        System.out.println("Летит");
    };
}
