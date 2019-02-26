import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class MyList<T> {
    Node head;

    public void add(T val){
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
        }else {
            Node last = getLastNode();
            last.setNext(newNode);
        }
    }

    private Node getLastNode() {
        Node cur = head;
        while(cur.next != null)  cur = cur.next;
        return cur;
    }

    public T get(int index) {
        checkNotEmpty();
        Node cur = head;
        for(int i = 0; i < index; i++){
            if (isEnd(cur)){
                throw new IndexOutOfBoundsException("index :" + index);
            }
            cur = cur.next;
        }
        return cur.val;
    }

    public void delete(int index){
        checkNotEmpty();
        Node cur = head;
        Node prev = cur;
        for(int i = 0; i < index; i++){
            if (isEnd(cur)){
                throw new IndexOutOfBoundsException("index :" + index);
            }
            prev = cur;
            cur = cur.next;
        }
        if (index == 0){
            head = head.next;
        }else {
            prev.next = cur.next;
        }
    }

    private void checkNotEmpty()  {
        if (head == null) {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean isEnd(Node node){
        return node.next == null;
    }


    class Node {
        T val;
        Node next;

        public Node(T val) {
            this.val = val;
        }

        public void setNext(Node next){
            this.next = next;
        }
    }


}


