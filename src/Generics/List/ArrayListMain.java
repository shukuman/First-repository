package Generics.List;

public class ArrayListMain {

    public static void main(String[] args) {
        MyList <String> stringList = new MyArrayList<>();
        stringList.add("item #1");
        stringList.add("item #2");
        stringList.add("item #3");
        stringList.add("item #4");
        stringList.add("item #5");
        stringList.add("item #6");
        stringList.add("item #7");
        stringList.add("item #8");
        stringList.remove(2);
        stringList.set(0, "abc");
        stringList.add(0, "alpha");
        stringList.add(9,"beta");

        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        System.out.println(stringList.size());


        MyList <Integer> integerList = new MyArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        integerList.remove(2);
        integerList.set(0, 777);
        integerList.add(0, 1000);
        integerList.add(9,9999);

        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
        }
        System.out.println(integerList.size());
    }
}