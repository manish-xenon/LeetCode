package dyanamic_programming;

/**
 * Created by Manish on 1/22/15.
 */
public class LongestIncreasingSubsequence {
    public static void longestIncreasingSubsequence(int[] num){
        String[] paths = new String[num.length]; // for paths
        int[] sizes = new int[num.length];// for path size

        // now fill each size index with value 1 and each paths with its
        // num value (I mean the start and end of the path is same element
        for(int i=0; i < num.length; i++){
            paths[i] = num[i] + " ";
            sizes[i] = 1;
        }

        // Now main thing starts
        int maxLengthOfPath = 1;
        for(int i=1; i < num.length; i++){
            for(int j=0; j < i; j++){
                if(num[i] > num[j] && sizes[i] < sizes[j] + 1){ //most important
                    sizes[i] = sizes[j] + 1;
                    paths[i] = paths[j] + num[i] + " "; // append current element num[i]
                    // to the previous path paths[j]
                }
                if(maxLengthOfPath < sizes[i]){
                    maxLengthOfPath = sizes[i]; // update maxLengthOfPath
                }
            }
        }
        // Now reap the result.
        // Just display the path whose size is equal to maxLengthOfPath
        for(int i=0; i < num.length; i++){
            if(sizes[i] == maxLengthOfPath) // print all paths with same maximum lengths
                System.out.println(paths[i]);
        }
    }

    public static void main(String[] args) {
        int[] test = {4,4,2,0,4,4,7,7};
        longestIncreasingSubsequence(test);
    }
}
