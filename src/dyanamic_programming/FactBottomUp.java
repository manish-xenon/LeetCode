package dyanamic_programming;

/**
 * Created by manish on 1/21/15.
 */
public class FactBottomUp {
    public static int factRec(int n){
        int[]fact = new int[n+1]; // Array 0 to n element. As we need to calculate
        // fib[n] so size has to be n+1
        //base cases
        fact[0] = 1;
        fact[1] = 1;

        for(int i=2; i <= n; i++){
            fact[i] = i * fact[i-1];
        }
        return fact[n];
    }

    public static void main(String[] args) {
        System.out.println(factRec(10));
    }
}
