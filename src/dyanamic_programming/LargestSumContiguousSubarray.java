package dyanamic_programming;

/**
 * Created by manish on 1/21/15.
 */
public class LargestSumContiguousSubarray {
    public static int largest(int[] a){
        int largest_sum = a[0];
        int max_until_here = a[0];
        for(int i=1; i<a.length;i++){
            max_until_here = Math.max(max_until_here + a[i], a[i]);
            largest_sum = Math.max(max_until_here, largest_sum);
        }
        return largest_sum;
    }

    public static void main(String[] args) {
        int[] arr = {-10,-2,-1,-7,-8,-10,-50,-40,-100,-90};
        System.out.println(largest(arr));
    }
}
