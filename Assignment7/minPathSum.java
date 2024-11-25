package DSA_GATE.Assignment7;

public class minPathSum {

    public static int minimumPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // updating 1st row by adding prev element sum

        for (int j = 1; j < n; j++) {
            grid[0][j] += grid[0][j - 1];
        }

        // updating 1st col by adding prev element sum

        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i - 1][0];
        }

        // updating rest of the elements with adding it to min of their top or left
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[m - 1][n - 1];
    }
    public static void main(String[] args) {
        int mat[][]={{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minimumPathSum(mat));
    }
}
