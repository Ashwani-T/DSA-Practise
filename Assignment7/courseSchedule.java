package DSA_GATE.Assignment7;
import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Create adjacency list
        List<List<Integer>> adjList = new ArrayList<>(numCourses);
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<>());
        }
        
        // Fill adjacency list
        for (int[] prereq : prerequisites) {
            adjList.get(prereq[0]).add(prereq[1]);
        }
        
        // 0 = unvisited, 1 = visiting, 2 = visited
        int[] visited = new int[numCourses];
        
        // Check for cycle in each course
        for (int i = 0; i < numCourses; i++) {
            if (hasCycle(i, visited, adjList)) {
                return false;
            }
        }
        
        return true;
    }
    
    private boolean hasCycle(int course, int[] visited, List<List<Integer>> adjList) {
        if (visited[course] == 1) return true;
        if (visited[course] == 2) return false;
        
        visited[course] = 1;
        
        for (int neighbor : adjList.get(course)) {
            if (hasCycle(neighbor, visited, adjList)) {
                return true;
            }
        }
        
        visited[course] = 2;
        return false;
    }
}

public class courseSchedule {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
       
        int totalCourses1 = 2;
        int[][] prerequisites1 = {{1,0}};
        boolean result1 = solution.canFinish(totalCourses1, prerequisites1);
        System.out.println("Test case 1 result: " + result1);
        
       
        int totalCourses2 = 2;
        int[][] prerequisites2 = {{1,0},{0,1}};
        boolean result2 = solution.canFinish(totalCourses2, prerequisites2);
        System.out.println("Test case 2 result: " + result2);
        
       
        int totalCourses3 = 4;
        int[][] prerequisites3 = {{1,0},{2,1},{3,2}};
        boolean result3 = solution.canFinish(totalCourses3, prerequisites3);
        System.out.println("Test case 3 result: " + result3);
    }
}
