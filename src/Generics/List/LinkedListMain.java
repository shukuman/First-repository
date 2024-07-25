package Generics.List;

public class LinkedListMain {
    public static void main(String[] args) {
        MyList <String> stringLink = new MyLinkedList <>();

        stringLink.add("A");
        stringLink.add("B");

        stringLink.add(0,"Start");
        stringLink.add(2,"Pause");
        stringLink.add(4,"Stop");

        stringLink.set(0,"X");
        stringLink.set(2,"Y");
        stringLink.set(4,"Z");

        stringLink.remove(0);
        stringLink.remove(1);
        stringLink.remove(2);

        for (int i = 0; i < stringLink.size(); i++) {
            System.out.println(stringLink.get(i));
        }
        System.out.println(stringLink.size());

        System.out.println(stringLink.contains("A"));
        System.out.println(stringLink.contains("Y"));



        MyList <Double> doubleLink = new MyLinkedList <>();

        doubleLink.add(10.1);
        doubleLink.add(20.2);

        doubleLink.add(0,777.7);
        doubleLink.add(2,888.8);
        doubleLink.add(4,999.9);

        doubleLink.set(0, 111.1);
        doubleLink.set(2, 222.1);
        doubleLink.set(4, 333.1);

        doubleLink.remove(0);
        doubleLink.remove(1);
        doubleLink.remove(2);

        for (int i = 0; i < doubleLink.size(); i++) {
            System.out.println(doubleLink.get(i));
        }
        System.out.println(doubleLink.size());

        System.out.println(doubleLink.contains(10.1));
        System.out.println(doubleLink.contains(20.1));
    }
}
