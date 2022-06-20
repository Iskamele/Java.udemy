package aegis.java.basic.section99_test;

public class Solution {
    public static boolean validParentheses(String parens) {
        int check = 0;
        if (parens.length() <= 100) {
            for (int i = 0; i < parens.length(); i++) {
                if (check != -1 && parens.charAt(i) == '(') {
                    check++;
                } else if (check != -1 && parens.charAt(i) == ')') {
                    check--;
                } else if (check < 0) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return check == 0;
    }

    public static void main(String[] args) {
        Solution.validParentheses("()"); //true
        Solution.validParentheses(")(()))"); //false
        Solution.validParentheses("("); //false
        Solution.validParentheses("(())((()())())"); //true
        Solution.validParentheses("({)[}"); //true
        Solution.validParentheses("(quad(far quad) Farquad)"); //true
        Solution.validParentheses("(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))"); //true
    }
}