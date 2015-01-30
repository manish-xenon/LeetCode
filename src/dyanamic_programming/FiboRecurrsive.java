package dyanamic_programming;

/**
 * Created by manish on 1/21/15.
 */
public class FiboRecurrsive {
    public static int fiboRec(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        return fiboRec(n-1) + fiboRec(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fiboRec(45));
    }
}
