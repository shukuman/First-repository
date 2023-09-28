package Person;

public class PersonThis {
    int age;
    int weight;
    int length;

    public PersonThis(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public PersonThis(int age, int weight, int length) {
        this(age, weight); // Вызов конструктора с двумя параметрами
        this.length = length; // Добавление недостающей переменной
    }
}
