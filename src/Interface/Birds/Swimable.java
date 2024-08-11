package Interface.Birds;

public interface Swimable {
    default void swim() {
        System.out.println("Плывет");
    };
}
