package Comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "template", "hi", "liquid", "tax", "transaction");
        // Отсортировать слова из `list` по количеству символов в порядке возрастания.

        Comparator <String> numOfChar = new NumOfCharComparator();
        list.sort(numOfChar);
        System.out.println(list);
    }
}
