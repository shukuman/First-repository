package Inheritance.Animal;

public class CatConstructor {
    String name;
    int age;
    // конструктор для первого кота
    public CatConstructor(String name, int age) { //имя Конструктора должно совпадать с именем Класса
        this.name = name;
        this.age = age;
    }
    // конструктор для второго кота
    public CatConstructor(String name) {
        this.name = name;
    }
}
