package Generics.List;

public class MyLinkedList <T> implements MyList <T> {
    private Node <T> first;
    private Node <T> last;
    private int size;

    public MyLinkedList() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public void add(T value) {
        Node <T> node;
        if (size == 0) {
            node = new Node<>(null, null, value);
            first = node;
        } else {
            node = new Node<>(last, null, value);
            last.setNext(node);
        }
        last = node;
        size++;
    }

    @Override
    public void add(int index, T value) {
        Node <T> node;
       if (index == 0) {
            node = new Node<>(null, first, value);
            first = node;
        } else if (index == size) {
            node = new Node<>(last, null, value);
            last.setNext(node);
            last = node;
        } else {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.getNext();
            }
            Node <T> newNode = new Node <>(null, null, value);

            newNode.setNext(node);
            newNode.setPrev(node.getPrev());
            node.setPrev(newNode);
            node.getPrev().getPrev().setNext(newNode);
        }
        size++;
    }

    @Override
    public void set(int index, T value) {
        Node <T> node;
        if (index == 0) {
            first.setValue(value);
        } else if (index == size-1) {
            last.setValue(value);
        } else {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.getNext();
            }
            node.setValue(value);
        }
    }

    @Override
    public Object get(int index) {
        Node <T> node = first;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getValue();
    }

    @Override
    public void remove(int index) {
        Node <T> node;
        if (index == 0) {
            first = first.getNext();
        } else if (index == size-1) {
            last = last.getPrev();
        } else {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.getNext();
            }
            node.getPrev().setNext(node.getNext());
            node.getNext().setPrev(node.getPrev());
        }
        size--;
    }

    @Override
    public boolean contains(T value) {
        Node <T> node = first;
        for (int i = 0; i < size; i++) {
            if (node.getValue() == value) {
                return true;
            } else {
                node = node.getNext();
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }
}