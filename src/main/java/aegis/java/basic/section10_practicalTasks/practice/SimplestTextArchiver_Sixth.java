package aegis.java.basic.section10_practicalTasks.practice;

public class SimplestTextArchiver_Sixth {
    public static void main(String[] args) {
        String firstLine = "AAAAAAAABBBCCCCC";
        String secondLine = "ААААВВААААА";
        String thirdLine = "АВС";

        System.out.println(simplestTextArchiver(firstLine));
        System.out.println(simplestTextArchiver(secondLine));
        System.out.println(simplestTextArchiver(thirdLine));
    }

    private static String simplestTextArchiver(String input) {
        StringBuilder builder = new StringBuilder();
        int count = 1;
        char temp = ' ';
        char ch;
        for (int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            do {
                if (temp == ch) {
                    break;
                } else {
                    for (int j = i + 1; j < input.length(); j++) {
                        if (input.charAt(j) == ch) {
                            count++;
                        } else {
                            break;
                        }
                    }
                }
                temp = ch;
                builder.append(ch);
                builder.append(count);
                count = 1;
                break;
            } while (true);
        }
        return builder.toString();
    }
}