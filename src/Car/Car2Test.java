package Car;

import Car.Car2;

public class Car2Test {
    public static void main(String[] args) {
        Car2 auto = new Car2();

        auto.setModel("Kia Cerato");
        auto.setYear(2022);
        auto.setMileage(25000);

        System.out.println("Auto model: " + auto.getModel());
        System.out.println("Auto year: " + auto.getYear());
        System.out.println("Auto mileage: " + auto.getMileage());

        Car2 automobile = new Car2();

        automobile.setModel("Toyota Corolla");
        automobile.setYear(1998);
        automobile.setMileage(340000);

        System.out.println("Automobile model: " + automobile.getModel());
        System.out.println("Automobile year: " + automobile.getYear());
        System.out.println("Automobile mileage: " + automobile.getMileage());
    }
}
