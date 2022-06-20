package aegis.java.basic.section99_test;

public class Solution2 {
    public static boolean validParentheses(String parens) {
        int check = 0;
        if (parens.length() <= 100) {
            for (int i = 0; i < parens.length(); i++) {
                if (check >= 0) {
                    if (parens.charAt(i) == '(') {
                        check++;
                    } else if (parens.charAt(i) == ')') {
                        check--;
                    }
                } else return false;
            }
        } else {
            return false;
        }
        return check == 0;
    }

    public static void main(String[] args) {
        Solution2.validParentheses("()"); //true
        Solution2.validParentheses(")(()))"); //false
        Solution2.validParentheses("("); //false
        Solution2.validParentheses("(())((()())())"); //true
        Solution2.validParentheses("({)[}"); //true
        Solution2.validParentheses("(quad(far quad) Farquad)"); //true
        Solution2.validParentheses("(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))"); //true
    }
}