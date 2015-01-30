package sorting;

/**
 * Created by manish on 1/20/15.
 */
public class BubbleSortEfficient {
    public static void bubbleSort(int[] a){
        boolean swapped = true;
        int comparisons = 0;
        for(int i = a.length - 1; i > 0 && swapped; i--){
            swapped = false;
            for(int j=0; j < i; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapped = true;
                }
                comparisons++;
            }
        }
        System.out.println("No of Comparisons " + comparisons);
    }

    public static void main(String[] args) {
        //int test[] = {12,22,11,10,45,3,56,67,1,34};
        int test[] = {1,2,3,4,5,6,7,8,9};
        bubbleSort(test);
        for(int i=0; i<test.length;i++){
            System.out.print(test[i] + ", ");
        }
    }
}
