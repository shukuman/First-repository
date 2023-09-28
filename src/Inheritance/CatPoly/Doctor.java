package Inheritance.CatPoly;

public class Doctor {
    public void healLion(Lion lion) {
        System.out.println("Лев здоров");
    }
    public void healTiger(Tiger tiger) {
        System.out.println("Тигр здоров");
    }
    public void healCheetah(Cheetah cheetah) {
        System.out.println("Гепард здоров");
    }

    public void healCat(CatPoly cat) {
        System.out.println("Пациент здоров");
        cat.run();
    }

    public void feedLeopard(Leopard leo) {
        System.out.println("Леопард голоден");
    }
    public void feedPuma(Puma bagira) {
        System.out.println("Пума голодна");
    }
    public void feedCat(CatPoly cat) {
        System.out.println("Пациент голоден");
        cat.eat();
    }
}
