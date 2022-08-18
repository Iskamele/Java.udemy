package aegis.java.basic.section10_practicalTasks.practice;

public class SimplestTextArchiverVariantOneMaster {

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
        StringBuilder result = new StringBuilder();
        char current = source.charAt(0);
        int count = 1;
        for (int i = 0; i < source.length(); i++) {
            if (source.charAt(i) == current) {
                count++;
            } else {
                result.append(current).append(count);
                count = 1;
                current = source.charAt(i);
            }
        }
        result.append(current).append(count);
        return result.toString();
    }

    private static String unzip(String zipped) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < zipped.length(); i += 2) {
            int count = Integer.parseInt(String.valueOf(zipped.charAt(i + 1)));
            char ch = zipped.charAt(i);
            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}