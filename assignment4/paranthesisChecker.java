package DSA_GATE.assignment4;

public class paranthesisChecker {
        public static boolean isValid(String s) {
            while (true) {
                if (s.contains("()")) {
                    s = s.replace("()", "");
                } else if (s.contains("{}")) {
                    s = s.replace("{}", "");
                } else if (s.contains("[]")) {
                    s = s.replace("[]", "");
                } else {
                    return s.isEmpty();
                }
            }
        }
    public static void main(String[] args) {
        System.out.println(isValid("{()[]}"));
    }
}
