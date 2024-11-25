package DSA_GATE.Assignment7;

import java.util.Arrays;

public class longestSubstringWithoutRepetation {
    public static int longestSubstring(String s){
        /*we will use two pointer approach
        Step-1: define an array of length 128 which represents all the characters
                set all elements as -1
        Step-2: Initialize left=0; this will keep track of last unqiue character
        Step-3: Initialize a loop with right variable from 0 to len-1 
        Step-4: within a loop store the value of right in character array at place  where character correspond

        Step-5: if that character has already sum number such that the number is greater than or equal to current left value

        then change the left to value of that char+1 this simply means that it sees a repeating character and now it goes to next character

        compare the length using right-left+1

        return maxLength

        */
        int lastSeen[]=new int[128];
        Arrays.fill(lastSeen, -1);

        int left=0;
        int maxLength=-1;

        for(int right=0;right<s.length();right++){
            char currChar=s.charAt(right);
            
            if(lastSeen[currChar]>=left){
                left=lastSeen[currChar]+1;
            }
            lastSeen[currChar]=right;

            maxLength=Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s="abcabcabc";
        System.out.println(longestSubstring(s));
    }
}
