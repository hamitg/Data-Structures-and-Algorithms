public class MyDoubleList <T> {

    Node dummyHead = new Node();
    Node dummyTail = new Node();


    // DummyHead <-> DummyTail
    // X - Y - Z - T - K  - DummyTail
    public MyDoubleList() {
        dummyHead.next = dummyTail;
        dummyTail.prev = dummyHead;
    }

    public void add(T val) {
        Node newNode = new Node(val);
        Node prevTail  = dummyTail.prev;
        newNode.next = dummyTail;
        newNode.prev = prevTail;
        prevTail.next = newNode;
        dummyTail.prev = newNode;
    }

    public void delete(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    public T removeFirst() {
        Node node = dummyHead.next;
        T val = node.val;
        delete(node);
        return val;
    }


    public class Node {
        Node next, prev;
        T val;

        public Node() {
        }

        public Node(T val) {
            this.val = val;
        }
    }



}
