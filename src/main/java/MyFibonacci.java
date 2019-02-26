import java.util.HashMap;
import java.util.LinkedHashMap;

public class MyFibonacci {
    HashMap<Integer, Integer> sums = new HashMap<Integer, Integer>();

    public int calculateFormula (int num) {
        if (num < 0)
            throw new IndexOutOfBoundsException();
        else if (num == 0)
            return 0;
        else if (num == 1)
            return 1;
        else if (num == 2)
            return 1;

        else {
            if (sums.containsKey(num)) {
                return sums.get(num);
            } else {
                sums.put(num,calculateFormula(num-1) + calculateFormula(num-2));
                return sums.get(num);
            }
        }

    }



}
