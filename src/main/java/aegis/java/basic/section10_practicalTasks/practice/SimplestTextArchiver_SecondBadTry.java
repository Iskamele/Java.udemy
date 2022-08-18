package aegis.java.basic.section10_practicalTasks.practice;

public class SimplestTextArchiver_SecondBadTry {
    public static void main(String[] args) {
        String firstLine = "AAAAAAAABBBCCCCC";
        String secondLine = "ААААВВААААА";
        String thirdLine = "АВС";

        System.out.println(simplestTextArchiver(firstLine));
        System.out.println(simplestTextArchiver(secondLine));
        System.out.println(simplestTextArchiver(thirdLine));
    }

    private static String simplestTextArchiver(String input) {
        StringBuilder builder = new StringBuilder(input);

        char ch = builder.charAt(0);
        int index = 1;
        int count = 1;
        int numbers = 0;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                count++;
            } else {
                    builder.delete(index, count + numbers);
                    ch = builder.charAt(index + numbers);
                    builder.insert(index + numbers, count);
                numbers++;
                index++;
                count = 1;
            }
        }
        builder.delete(index, count + numbers);
        builder.insert(index + numbers, count);


        return builder.toString();
    }
}
