package DSA_GATE.Assignment7;

import java.util.*;
import java.util.LinkedList;
public class wordLadder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        // Convert wordList to a HashSet for O(1) lookup
        Set<String> wordSet = new HashSet<>(wordList);
        
        // Quick check to see if endWord is in wordSet
        if (!wordSet.contains(endWord)) return 0;
        
        // Queue for BFS
        Queue <String> queue = new LinkedList<>();
        queue.offer(beginWord);
        
        // Set to keep track of visited words
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        
        int level = 1;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();
                
                // If we've reached the endWord, return the level
                if (currentWord.equals(endWord)) return level;
                
                // Try changing each character of the word
                for (int j = 0; j < currentWord.length(); j++) {
                    char[] chars = currentWord.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[j] = c;
                        String newWord = new String(chars);
                        
                        if (wordSet.contains(newWord) && !visited.contains(newWord)) {
                            queue.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                }
            }
            level++;
        }
        
        // If we can't reach endWord
        return 0;
    }
    public static void main(String[] args) {
    

        // Test case 1
        String beginWord1 = "hit";
        String endWord1 = "cog";
        List<String> wordList1 = Arrays.asList("hot","dot","dog","lot","log","cog");
        System.out.println(ladderLength(beginWord1, endWord1, wordList1));
        
    }
}
