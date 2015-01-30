package dyanamic_programming;

/**
 * Created by manish on 1/21/15.
 */
public class FiboEfficientDp {
    public static long fiboEfficient(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        long prev = 0;
        long current = 1;
        long sum = 0;
        for(int i=2; i<=n; i++){
            sum = prev + current;
            prev = current;
            current = sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(fiboEfficient(45));
    }

}
