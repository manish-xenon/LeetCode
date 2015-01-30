package dyanamic_programming;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by manish on 1/21/15.
 */
public class FactTopDownDp {
    public static long factTopDownDp(int n){
        if(n < 2) return 1;
        Map<Integer, Long> computed = new HashMap<Integer, Long>();
        computed.put(0, 1L);
        computed.put(1, 1L);
        return factTopDownDp(n, computed);
    }

    private static long factTopDownDp(int n, Map<Integer, Long> computed){
        if(computed.containsKey(n)) return computed.get(n);
        computed.put(n-1, factTopDownDp(n-1, computed));

        long finalValue = n * computed.get(n-1);
        computed.put(n, finalValue);
        return finalValue;
    }

    public static void main(String[] args) {
        System.out.println(factTopDownDp(10));
    }
}
