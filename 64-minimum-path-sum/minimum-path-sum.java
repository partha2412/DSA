
import java.util.Arrays;

class Solution {
     int[][] dp;
     int m;
     int n;
    public int minPathSum(int[][] grid) {
        n = grid[0].length;
        m = grid.length;

        dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(grid, 0, 0);
    }

    private int helper(int[][] grid, int x, int y) {

        if (x == m - 1 && y == n - 1) {
            return grid[x][y];
        }

        // 1. Check memoization
        if (dp[x][y] != -1) {
            return dp[x][y];
        }

        if (x == m - 1) {
            dp[x][y] = grid[x][y]
                    + helper(grid, x, y + 1);
        } else if (y == n - 1) {
            dp[x][y] = grid[x][y]
                    + helper(grid, x + 1, y);
        } else {
            dp[x][y] = grid[x][y] + Math.min(
                    helper(grid, x, y + 1),
                    helper(grid, x + 1, y)
            );
        }

        // 2. Return the cached result
        return dp[x][y];
    }
}
