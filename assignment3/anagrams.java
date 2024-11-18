package DSA_GATE.assignment3;

public class anagrams {
    public static boolean areAnagrams(String s1,String s2){
        s1.toLowerCase();
        s2.toLowerCase();

        if(s1.length()!=s2.length()){
            return false;
        }

        int arr[]=new int[26];
        for(int i=0;i<s1.length();i++){
            arr[s1.charAt(i)-'a']++;
        }

        for(int i=0;i<s2.length();i++){
            arr[s2.charAt(i)-'a']--;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="geeks";
        String s2="skgee";

        System.out.println(areAnagrams(s1, s2));
    }
}
