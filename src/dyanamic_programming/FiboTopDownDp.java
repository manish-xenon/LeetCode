package dyanamic_programming;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by manish on 1/21/15.
 */
public class FiboTopDownDp {
    public static long fiboTopDownDp(int n){
        if(n < 3) return 1;
        Map<Integer, Long> computed = new HashMap<Integer, Long>();
        computed.put(1, 1L);
        computed.put(2, 1L);
        return fiboTopDownDp(n, computed);
    }

    private static long fiboTopDownDp(int n, Map<Integer, Long> computed){
        if(computed.containsKey(n)) return computed.get(n);
        computed.put(n-1, fiboTopDownDp(n-1, computed));
        computed.put(n-2, fiboTopDownDp(n-2, computed));

        long finalValue = computed.get(n-1) + computed.get(n-2);
        computed.put(n, finalValue);
        return finalValue;
    }

    public static void main(String[] args) {
        System.out.println(fiboTopDownDp(45));
    }
}
