package Car;

public class Car {
    String brand;
    String model;
    int speed;

    public void start() {
        speed += 50;
    }
    public void stop() {
        speed -= 25;
    }
}
