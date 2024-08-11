package Library;

public class Main {

    public static void main(String[] args) {
        // Примитивные -> Объектные
        // byte        -> Byte
        // short       -> Short
        // int         -> Integer
        // long        -> Long
        // float       -> Float
        // double      -> Double
        // boolean     -> Boolean
        // char        -> Character
        //             -> String
        //             -> Любой Java класс (enum, интерфейсы)

        Student student = new Student("Марк");
        Worker worker = new Worker("Джефф");

        Employee employee = new Employee();

        Store store = new Store();

        employee.orderBook(store, "Война и Мир");

        student.takeBook(employee, "Война и Мир");
        worker.takeBook(employee, "Мастер и Маргарита");
    }
}
