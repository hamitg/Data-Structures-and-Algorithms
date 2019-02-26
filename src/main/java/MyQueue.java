import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue <T> {
    LinkedList<T> list = new LinkedList<T>();
    public void add (T val) {
        list.add(val);
    }

    public void pop () {
        list.removeFirst();
    }

    public T peek () {
        return list.getFirst();
    }

    public int size () {
        return list.size();
    }

    public T get (int index) {
        return list.get(index);
    }



}
