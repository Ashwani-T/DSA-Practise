package DSA_GATE.assignment3;
import java.util.*;

 
public class ratwithMaze {
   public static List<String> findPaths(int[][] maze, int n) {
        List<String> result = new ArrayList<>();
        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            return result; 
        }
        boolean[][] visited = new boolean[n][n];
        backtrack(maze, 0, 0, n, "", visited, result);
        Collections.sort(result);
        return result;
    }

    private static void backtrack(int[][] maze, int x, int y, int n, String path, boolean[][] visited, List<String> result) {
        if (x == n - 1 && y == n - 1) { 
            result.add(path);
            return;
        }

        visited[x][y] = true;

        int[] dx = {1, 0, 0, -1}; 
        int[] dy = {0, -1, 1, 0};
        char[] directions = {'D', 'L', 'R', 'U'};

        
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (isSafe(maze, newX, newY, n, visited)) {
                backtrack(maze, newX, newY, n, path + directions[i], visited, result);
            }
        }

       
        visited[x][y] = false;
    }

    private static boolean isSafe(int[][] maze, int x, int y, int n, boolean[][] visited) {
        return x >= 0 && y >= 0 && x < n && y < n && maze[x][y] == 1 && !visited[x][y];
    }

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        int n = maze.length;
        List<String> paths = findPaths(maze, n);

        if (paths.isEmpty()) {
            System.out.println("No path found");
        } else {
            for (String path : paths) {
                System.out.println(path);
            }
        }
    }

}
