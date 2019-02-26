import org.junit.Test;
import static org.junit.Assert.*;

public class MyListTest {

    @Test
    public void testMyListAdd() {
        int expected = 10;
        MyList<Integer> list = new MyList<Integer>();
        list.add(expected);
        int actual = list.get(0);
        assertEquals(expected, actual);
    }

    @Test
    public void testMyListAddMany() {
        int amountOfNumber = 100;

        MyList<Integer> list = new MyList<Integer>();

        for (int i = 0; i < amountOfNumber ; i++){
            list.add(i);
        }

        for (int i = 0; i < amountOfNumber ; i++){
            int actual = list.get(i);
            assertEquals(i, actual);
        }
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testMyListAddThrowsExceptionWhenOutOfBoundary() {
        MyList list = new MyList();
        list.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testMyListAddThrowsExceptionWhenOutOfBoundaryWithElements() {
        MyList list = new MyList();
        list.add(10);
        list.get(1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testMyListDeleteThrowsExceptionWhenOutOfBoundary() {
        MyList list = new MyList();
        list.delete(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testMyListDeleteThrowsExceptionWhenOutOfBoundaryWithManyElements() {
        MyList list = new MyList();
        list.add(1);
        list.delete(1);
    }

    @Test
    public void testMyListDelete() {
        MyList list = new MyList();
        list.add(10);
        list.add(20);
        list.delete(0);
        assertEquals(20, list.get(0));
    }

    @Test
    public void testMyListDeleteWithManyElements() {
        MyList list = new MyList();
        list.add(10);
        list.add(15);
        list.add(20);
        list.delete(1);
        assertEquals(10, list.get(0));
        assertEquals(20, list.get(1));
    }




}
