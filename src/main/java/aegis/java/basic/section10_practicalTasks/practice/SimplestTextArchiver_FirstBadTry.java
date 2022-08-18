package aegis.java.basic.section10_practicalTasks.practice;

public class SimplestTextArchiver_FirstBadTry {
    public static void main(String[] args) {
        String firstLine = "AAAAAAAABBBCCCCC";
        String secondLine = "ААААВВААААА";
        String thirdLine = "АВС";

        System.out.println(simplestTextArchiver(firstLine));
        System.out.println(simplestTextArchiver(secondLine));
        System.out.println(simplestTextArchiver(thirdLine));
    }

    private static String simplestTextArchiver(String string) {
        StringBuilder builder = new StringBuilder(string);

        int count = 1;
        int index = 0;
        boolean thisFirst = false;
        for (int i = 1; i < string.length(); i++) {
            char symbol = builder.charAt(index);
            if (builder.charAt(index + 2) == symbol) {
                builder.deleteCharAt(index + 1);
                builder.insert(index + 1, count);
                count++;
                if (thisFirst) {
                    builder.deleteCharAt(index + 2);
                }
                thisFirst = true;
                continue;
            }
            count = 1;
            index += 2;
            thisFirst = false;
        }

        return builder.toString();
    }
}
