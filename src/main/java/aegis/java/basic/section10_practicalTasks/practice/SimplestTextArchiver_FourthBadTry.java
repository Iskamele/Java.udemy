package aegis.java.basic.section10_practicalTasks.practice;

public class SimplestTextArchiver_FourthBadTry {
    public static void main(String[] args) {
        String firstLine = "AAAAAAAABBBCCCCC"; // 8 3 5
        String secondLine = "ААААВВААААА";     // 4 2 5
        String thirdLine = "АВС";              // 1 1 1

        System.out.println(simplestTextArchiver(firstLine));
        System.out.println(simplestTextArchiver(secondLine));
        System.out.println(simplestTextArchiver(thirdLine));
    }

    private static String simplestTextArchiver(String input) {

        int count = 0;

        char[] uniqSymbols = new char[input.length()];
        int[] counts = new int[input.length()];
        char uniqSymbol = input.charAt(0);

        for (int i = 0; i < input.length(); i++) {

            for (int j = i + 1; j < input.length(); j++) {
                if (uniqSymbol == input.charAt(j)) {
                    count++;
                } else {
                    uniqSymbol = input.charAt(j);
                    break;
                }
            }
            uniqSymbols[i] = input.charAt(i);
            counts[i] = count;
            count = 0;
        }

        return input;
    }
}
