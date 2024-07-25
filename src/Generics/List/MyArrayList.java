package Generics.List;

import java.util.Arrays;

public class MyArrayList <T> implements MyList <T> {

    private Object[] items;
    private int size;

    public MyArrayList() {
        items = new Object[10];
        size = 0;
    }

    @Override
    public void add(T value) {
        items[size++] = value;
        if (size == items.length) {
            items = Arrays.copyOf(items, (int) (items.length * 1.5 + 1));
        }
    }

    @Override
    public void add(int index, T value) {
        items[size++] = null;
        if (size == items.length) {
            items = Arrays.copyOf(items, (int) (items.length * 1.5 + 1));
        }
        for (int i = size; i > index; i--) {
            items[i] = items[i-1];
            }
        items[index] = value;
    }

    @Override
    public void set(int index, T value) {
        items[index] = value;
    }

    @Override
    public Object get(int index) {
        return items[index];
    }

    @Override
    public void remove(int index) {
        for (int i = index; i < size; i++) {
            items[i] = items[i + 1];
        }
        size--;
    }

    @Override
    public boolean contains(T value) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }
}