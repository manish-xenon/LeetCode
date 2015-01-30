package dyanamic_programming;

/**
 * Created by manish on 1/21/15.
 */
public class FactEfficientDp {
    public static long factEfficient(int n){
        if(n == 0 || n == 1) return 1;
        long current = 1;
        long product = 0;
        for(int i=2; i<=n; i++){
            product = i * current;
            current = product;
        }
        return product;
    }
    public static void main(String[] args) {
        System.out.println(factEfficient(10));
    }

}
