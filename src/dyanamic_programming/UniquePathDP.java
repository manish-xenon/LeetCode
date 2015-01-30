package dyanamic_programming;

/**
 * Created by manish on 1/22/15.
 */
// Bottom Up DP using Tabulation
public class UniquePathDP {
    public static int uniquePathsDP(int m, int n) {
        int[][] matrix = new int[m][n];
        // base case of DP
        // fill last row and last column by 1
        for(int row = 0; row < m; row++){
            matrix[row][n-1] = 1;
        }

        for(int col = 0; col < n; col++){
            matrix[m-1][col] = 1;
        }

        for(int i = m-2; i >= 0; i--){
            for(int j = n-2; j >= 0; j--){
                matrix[i][j] = matrix[i][j+1] + matrix[i+1][j];
            }
        }
        return matrix[0][0];
    }

    public static void main(String[] args) {
        System.out.println(uniquePathsDP(3, 7));
    }
}
