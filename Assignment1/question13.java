package DSA_GATE.Assignment1;

public class question13 {
    public static String isBalanced(String s){
        int balance=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                balance++;
            }else if(s.charAt(i)==')'){
                balance--;

                if(balance<0){
                    return "Not Balanced";
                }
            }
        }
        return (balance==0)? "Balanced":"Not Balanced";
    }
    public static void main(String[] args) {
        String str = "())((())";
        System.out.println(isBalanced(str));
    }
}
