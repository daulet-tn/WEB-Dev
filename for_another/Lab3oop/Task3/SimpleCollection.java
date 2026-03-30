import java.util.ArrayList;

class SimpleCollection<E> implements MyCollection<E> {
    ArrayList<E> list = new ArrayList<>();

    public void add(E element) {
        list.add(element);
    }

    public void remove(E element) {
        list.remove(element);
    }

    public boolean contains(E element) {
        return list.contains(element);
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}
