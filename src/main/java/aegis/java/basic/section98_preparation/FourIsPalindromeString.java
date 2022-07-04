package aegis.java.basic.section98_preparation;

public class FourIsPalindromeString {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam, I'm Adam!")); //true
        System.out.println(isPalindrome("Madam, Aam!")); //false
        System.out.println(isPalindrome("Hello, World!")); //false
        System.out.println(isPalindrome("Коту скоро сорок суток")); //true
    }

    public static boolean isPalindrome(String text) {
        return text.replaceAll("\\W", "")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W", ""))
                        .reverse().toString());
    }
}