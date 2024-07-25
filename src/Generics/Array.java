package Generics;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(List.of("a", "b", "c"));
        fill(list1, "z");
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>(List.of(1, 2, 3));
        fill(list2, 7);
        System.out.println(list2);
    }

    private static <T> void fill(List<T> list, T value) { // обобщенный метод
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value);
        }
    }
}
