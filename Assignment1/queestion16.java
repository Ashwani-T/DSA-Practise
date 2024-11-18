package DSA_GATE.Assignment1;
import java.util.Arrays;

public class queestion16 {

    public static String longestCommonPrefix(String[] arr) {
        if (arr == null || arr.length == 0) {
            return "-1";
        }
        Arrays.sort(arr);

       
        String first = arr[0];
        String last = arr[arr.length - 1];
        int minLength = Math.min(first.length(), last.length());

        
        int i = 0;
        while (i < minLength) {
            if( first.charAt(i) == last.charAt(i)){
                i++;
            }else{
                break;
            }
            
        }

        String commonPrefix = first.substring(0, i);

       
        return commonPrefix.isEmpty() ? "-1" : commonPrefix;
    }

    public static void main(String[] args) {
        String[] arr1 = {"hello", "world"};
        System.out.println(longestCommonPrefix(arr1)); 
    }
}

