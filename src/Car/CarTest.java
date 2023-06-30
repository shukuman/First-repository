package Car;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.brand = "Ferrari";
        car1.model = "Enzo";
        car1.speed = 150;

        car2.brand = "Chevrolet";
        car2.model = "Cobalt";
        car2.speed = 75;

        car1.start();
        car2.stop();

        System.out.println(car1.brand + " " + car1.model
                + " Speed: " + car1.speed + " km/h");
        System.out.println(car2.brand + " " + car2.model
                + " Speed: " + car2.speed + " km/h");
    }
}
