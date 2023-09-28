package Inheritance.CatPoly;

public class CatPolyTest {
    public static void main(String[] args) {
        Lion simba = new Lion();
        Tiger tigra = new Tiger();
        Cheetah cheek = new Cheetah();
        Leopard leo = new Leopard();
        Puma bagira = new Puma();
        Doctor doctorAibolit = new Doctor();

//        doctorAibolit.healLion(simba);
//        doctorAibolit.healTiger(tigra);
//        doctorAibolit.healCheetah(cheek);

        doctorAibolit.healCat(simba);
        doctorAibolit.healCat(tigra);
        doctorAibolit.healCat(cheek);

//        doctorAibolit.feedCat(leo);
//        doctorAibolit.feedCat(bagira);


//        Inheritance.CatPoly[] cats = new Inheritance.CatPoly[5];
//        cats[0] = new Lion();
//        cats[1] = new Tiger();
//        cats[2] = new Cheetah();
//        cats[3] = new Leopard();
//        cats[4] = new Puma();
//
//        for (int i = 0; i < cats.length; i++) {
//            cats[i].run();
//            cats[i].eat();
//        }
    }
}
