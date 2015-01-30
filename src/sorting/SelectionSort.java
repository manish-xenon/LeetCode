package sorting;

/**
 * Created by manish on 1/20/15.
 */
public class SelectionSort {
    public static void selectionSort(int[] a){
        int min;
        for(int i=0; i < a.length - 1; i++){
            min = i;
            for(int j =i+1; j < a.length; j++){
                if(a[j] < a[min]){
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }

    public static void main(String[] args) {
        int test[] = {12,22,11,10,45,3,56,67,1,34};
        //int test[] = {1,2,3,4,5,6,7,8,9};
        selectionSort(test);
        for(int i=0; i<test.length;i++){
            System.out.print(test[i] + ", ");
        }
    }
}
