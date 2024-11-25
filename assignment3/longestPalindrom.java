package DSA_GATE.Assignment3;



public class longestPalindrom {

    public static int checkFromCenter(String str, int start, int end) {
        while (start >= 0 && end < str.length()) {
            if(str.charAt(start) == str.charAt(end)){
                start--;
                end++;
            }else{
                break;
            }
            
        }
        return end - start - 1;
    }

    public static String longestPalindrome(String str) {
        if (str == null || str.length() < 1) {
            return "";
        }

        int start = 0, end = 0;

        for (int i = 0; i < str.length(); i++) {
 
            int len1 = checkFromCenter(str, i, i);
            
            int len2 = checkFromCenter(str, i, i + 1);

            int maxLength = Math.max(len1, len2);

            if (maxLength > (end - start)) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }

        if (start == end) {
            return str.substring(0, 1);
        }

        return str.substring(start, end + 1);
    }
    public static void main(String[] args) {
        String str = "geeksskeeg";
        System.out.println(longestPalindrome(str));
    }
}
