public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello Runtime");

        int salt = 200; //целое число
        double pi = 3.14; //дробное число

        String dogName = "Rex";

        double dollars; //объявили переменную
        dollars = 150.5; //присвоили значение
        System.out.println(dollars);

        int age = 30;
        age = 31;
        System.out.println(age);

        double changeMe = 4.6;
        changeMe = 7.4;
        System.out.println(changeMe);

        boolean car = 5 < 3; //true or false
        System.out.println(car);

        // int, byte, short, long - целые числа
        // float - дробные числа
        // char - символ

        double salary1 = 2456.8;
        float salary2 = 2456.8F;

        long example = 2524424537L;

        byte value1 = 120;
        byte value2 = 3;
        int value3 = value1 + value2;
        System.out.println(value3);

        long value4 = 1_000_000_000; // "_" отступ в цифрах для удобства чтения
        long value5 = 3_000_000_000L; // по умолчанию int
        long value6 = value4 + value5; // сработает если в конце переменной "value5" добавить литерал "L", так как
        // int: хранит целое число от -2147483648 до 2147483647
        System.out.println(value6);
    }
}
//psvm - Запуск Java приложения (public static void main(String[] args)
//sout - Вывод данных в консоль

/* комментарии
в несколько
строк
 */
