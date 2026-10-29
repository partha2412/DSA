
import java.util.Arrays;

class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid[0].length;
        int m = grid.length;

        int[][] dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(grid, 0, 0, m, n, dp);
    }

    private int helper(int[][] grid, int x, int y,
                       int m, int n, int[][] dp) {

        if (x == m - 1 && y == n - 1) {
            return grid[x][y];
        }

        // 1. Check memoization
        if (dp[x][y] != -1) {
            return dp[x][y];
        }

        if (x == m - 1) {
            dp[x][y] = grid[x][y]
                    + helper(grid, x, y + 1, m, n, dp);
        } else if (y == n - 1) {
            dp[x][y] = grid[x][y]
                    + helper(grid, x + 1, y, m, n, dp);
        } else {
            dp[x][y] = grid[x][y] + Math.min(
                    helper(grid, x, y + 1, m, n, dp),
                    helper(grid, x + 1, y, m, n, dp)
            );
        }

        // 2. Return the cached result
        return dp[x][y];
    }
}
