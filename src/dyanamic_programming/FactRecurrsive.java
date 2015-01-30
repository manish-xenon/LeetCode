package dyanamic_programming;

/**
 * Created by manish on 1/21/15.
 */
public class FactRecurrsive {
    public static int factRec(int n){
        if(n == 0 || n == 1) return 1;
        return n * factRec(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factRec(10));
    }
}
