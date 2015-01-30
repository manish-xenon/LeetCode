package sorting;

/**
 * Created by manish on 1/20/15.
 */
public class InsertionSort {
    public static void insertionSort(int[] a){
        int element, j;
        for(int i=1; i<a.length;i++){
            element = a[i]; // unsorted list first element
            j = i; // unsorted list first index
            while(j > 0 && a[j-1] > element){
                a[j] = a[j-1];
                j--;
            }
            a[j] = element; // at last put the element at the correct position j
            // because once out of while loop, j will be at correct position already.
        }
    }
    public static void main(String[] args) {
        int test[] = {12,22,11,10,45,3,56,67,1,34};
        //int test[] = {1,2,3,4,5,6,7,8,9};
        insertionSort(test);
        for(int i=0; i<test.length;i++){
            System.out.print(test[i] + ", ");
        }
    }
}
