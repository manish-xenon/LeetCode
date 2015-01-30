package dyanamic_programming;

/**
 * Created by manish on 1/21/15.
 */
public class FiboBottomUpDp {
    public static int fiboRec(int n){
        int[]fib = new int[n+1]; // Array 0 to n element. As we need to calculate
        // fib[n] so size has to be n+1
        //base cases
        fib[0] = 0;
        fib[1] = 1;

        for(int i=2; i <= n; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }

    public static void main(String[] args) {
        System.out.println(fiboRec(45));
    }
}
