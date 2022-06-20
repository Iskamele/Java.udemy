package aegis.java.basic.section99_test;

public class SolutionTaras {
    public static boolean validParentheses(String parens) {
        if (parens.length() <= 100) {
            return false;
        }
        int check = 0;
        for (int i = 0; i < parens.length(); i++) {
            if (check < 0) {
                return false;
            }

            if (parens.charAt(i) == '(') {
                check++;
            } else if (parens.charAt(i) == ')') {
                check--;
            }
        }
        return check == 0;
    }

    public static void main(String[] args) {
        SolutionTaras.validParentheses("()"); //true
        SolutionTaras.validParentheses(")(()))"); //false
        SolutionTaras.validParentheses("("); //false
        SolutionTaras.validParentheses("(())((()())())"); //true
        SolutionTaras.validParentheses("({)[}"); //true
        SolutionTaras.validParentheses("(quad(far quad) Farquad)"); //true
        SolutionTaras.validParentheses("(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))(((((((((())))))))))"); //true
    }
}