package Car;

public class CarConstructorTest {
    public static void main(String[] args) {
        CarConstructor car = new CarConstructor("Kia Sportage", 200);
        System.out.println(car.model);
        System.out.println(car.maxSpeed);
    }
}
