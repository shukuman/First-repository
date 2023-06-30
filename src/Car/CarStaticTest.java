package Car;

public class CarStaticTest {
    public static void main(String[] args) {
//        CarStatic c1 = new CarStatic();
//        System.out.println("Статическая переменная: " + c1.myStatic);
//        System.out.println("Не статическая переменная: " + c1.notStatic);

//        System.out.println(CarStatic.myStatic);
//        System.out.println(CarStatic.notStatic);

        CarStatic.myStatic += 20;

        CarStatic c1 = new CarStatic();
        System.out.println("Статическая переменная c1: " + c1.myStatic);
        c1.notStatic += 20;
        System.out.println("Не статическая переменная c1: " + c1.notStatic);

        CarStatic c2 = new CarStatic();
        System.out.println("Статическая переменная c2: " + c2.myStatic);
        System.out.println("Не статическая переменная c2: " + c2.notStatic);
    }
}
