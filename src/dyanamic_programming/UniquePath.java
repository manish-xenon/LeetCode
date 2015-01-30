package dyanamic_programming;

/**
 * Created by manish on 1/22/15.
 */
public class UniquePath {
    public static int uniquePaths(int m, int n) {
        int numberOfWays = uniquePaths(1, 1, m, n);
        return numberOfWays;
    }
    private static int uniquePaths(int row, int column, int m, int n){
        if(row == m || column == n){
            return 1;
        }
        if(row > m || column > n){
            return 0;
        }
        return uniquePaths(row + 1, column, m, n) + uniquePaths(row , column + 1, m, n);
    }

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }
}
