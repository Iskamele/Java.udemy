package aegis.java.basic.section10_practicalTasks.practice;

public class SimplestTextArchiver_WithTemplate {
    public static void main(String[] args) {
        // read source data
        String source = "A".repeat(8) + "B".repeat(3) + "C".repeat(5);
        System.out.println("Source text:   " + source);

        // processing
        String zipped = zip(source);
        // display results
        System.out.println("Zipped text:   " + zipped);

        // processing
        String unzipped = unzip(zipped);
        // display results
        System.out.println("Unzipped text: " + unzipped);
    }

    private static String zip(String source) {
        StringBuilder builder = new StringBuilder();
        int count = 1;
        char temp = ' ';
        char ch;
        for (int i = 0; i < source.length(); i++) {
            ch = source.charAt(i);
            do {
                if (temp == ch) {
                    break;
                } else {
                    for (int j = i + 1; j < source.length(); j++) {
                        if (source.charAt(j) == ch) {
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


    private static String unzip(String zipped) {
        StringBuilder builderZipped = new StringBuilder(zipped);
        StringBuilder builderUnzipped = new StringBuilder();

        int index = 0;

        for (int i = 0; i < zipped.length(); i++) {
            if (i % 2 == 0) {
                builderUnzipped.append(builderZipped.charAt(i));
                for (int j = index; j < zipped.length(); j++) {
                    if (j % 2 != 0) {
                        int count = Character.getNumericValue(zipped.charAt(j));
                        for (int k = 1; k < count; k++) {
                            builderUnzipped.append(builderZipped.charAt(i));
                        }
                        index += 2;
                        break;
                    }
                }
            }
        }
        return builderUnzipped.toString();
    }
}