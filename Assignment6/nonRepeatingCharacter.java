package DSA_GATE.Assignment6;

class nonRepeatingCharacter {
    
    public static char nonRepeatingChar(String s) {
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        
        for(int i=0;i<s.length();i++){
            if(count[(s.charAt(i)-'a')]==1){
                return s.charAt(i);
            }
        }
        return '$';
    }
    public static void main(String[] args) {
        String s="geeksforgeeks";
        System.out.println(nonRepeatingChar(s));
    }
}
