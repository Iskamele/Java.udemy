package aegis.java.basic.section10_practicalTasks.practice;

public class SimplestTextArchiver_ThirdBadTry {
    public static void main(String[] args) {
        String firstLine = "AAAAAAAABBBCCCCC"; // 8 3 5
        String secondLine = "ААААВВААААА";     // 4 2 5
        String thirdLine = "АВС";              // 1 1 1

        System.out.println(simplestTextArchiver(firstLine));
        System.out.println(simplestTextArchiver(secondLine));
        System.out.println(simplestTextArchiver(thirdLine));
    }

    private static String simplestTextArchiver(String input) {
        StringBuilder builder = new StringBuilder();
        builder.setLength(0);
        builder.append(input);
        int count = 1;
        int index = 1;

        boolean itsFirst = true;

        char ch = input.charAt(index);
        for (char element : input.toCharArray()) {
            if (ch == element){
                count++;
                if (itsFirst){
                    count--;
                    itsFirst = false;
                }
            } else {
                System.out.println(ch + " is " + count);
                builder.delete(index, count);
                count = 1;
                ch = builder.charAt(index);
                index++;
            }
        }
        System.out.println(ch + " is " + count);

        builder.delete(index, input.length());
        return builder.toString();
    }
}

