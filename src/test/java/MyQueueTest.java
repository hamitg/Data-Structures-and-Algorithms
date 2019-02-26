import org.junit.Test;
import static org.junit.Assert.*;

public class MyQueueTest {

    @Test
    public void testMyQueueAddition () {
        int a = 1;
        MyQueue q = new MyQueue();
        q.add(a);
        assertEquals(1, q.size());

    }

    @Test
    public void testMyQueuePop () {
        int a = 1;
        int b = 2;
        MyQueue q = new MyQueue();
        q.add(a);
        q.add(b);
        q.pop();
        assertEquals(2, q.get(0));
    }

    @Test
    public void testMyQueuePeek () {
        int a = 1;
        int b = 2;
        MyQueue q = new MyQueue();
        q.add(a);
        q.add(b);
        assertEquals(a, q.peek());
    }

    @Test
    public void testMyQueueBenchmark () {
        MyQueue q = new MyQueue();
        int size = 5000000;
        fillQueue(q, size);
        assertEquals(size, q.size());
        for(int i = 0; i < size; i++){
            q.pop();
            q.add(i);
            assertEquals(size, q.size());
        }
    }

    private void fillQueue(MyQueue queue, int size){
        for(int i = 0; i < size;i++){
            queue.add(i);
        }
    }


}
