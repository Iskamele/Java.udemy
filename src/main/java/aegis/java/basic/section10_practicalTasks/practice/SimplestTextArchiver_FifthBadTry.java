package aegis.java.basic.section10_practicalTasks.practice;

public class SimplestTextArchiver_FifthBadTry {
    public static void main(String[] args) {
        String firstLine = "AAAAAAAABBBCCCCC"; // 8 3 5
        String secondLine = "ААААВВААААА";     // 4 2 5
        String thirdLine = "АВС";              // 1 1 1

        System.out.println(simplestTextArchiver(firstLine));
        System.out.println(simplestTextArchiver(secondLine));
        System.out.println(simplestTextArchiver(thirdLine));
    }


    private static String simplestTextArchiver(String input) {
        StringBuilder builder = new StringBuilder(input);
        char uniqElement = input.charAt(0);
        int count = 0;
        int builderDelStart = 1;
        int builderDelEnd = 2;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == uniqElement){
                count++;
                builder.delete(builderDelStart,builderDelEnd + 1);
            } else {
                uniqElement = input.charAt(i);
                builder.insert(builderDelStart, count);
                count = 0;
                builderDelStart++;
                builderDelEnd++;
            }
        }

        return builder.toString();
    }
}