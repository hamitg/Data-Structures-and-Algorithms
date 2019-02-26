import org.junit.Test;
import static org.junit.Assert.*;

public class MyFibonacciTest {

    @Test
    public void testMyFibonacciCalculate () {
        int n = 100;
        MyFibonacci list = new MyFibonacci();
        assertEquals(21, list.calculateFormula(n));
    }
}
