package aegis.java.basic.section10_practicalTasks.master;

public class SimplestTextArchiverVariantThree {

    public static void main(String[] args) {
        // read source data A18 A9A9
        String source = "A".repeat(11) + "1".repeat(3) + "C".repeat(50)+ "7".repeat(42)+ "n".repeat(191);
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
        char prev = source.charAt(0);
        int count = 1;
        for (int i = 1; i < source.length(); i++) {
            char current = source.charAt(i);
            if (current == prev) {
                count++;
            } else {
                zipChar(result, prev, count);
                prev = current;
                count = 1;
            }
        }
        zipChar(result, prev, count);
        return result.toString();
    }

    private static void zipChar(StringBuilder result, char prev, int count) {
        int quotient = count / 9;
        int remainder = count % 9;
        for (int i = 0; i < quotient; i++) {
            result.append(prev).append(9);
        }
        if (remainder !=0){
            result.append(prev).append(remainder);
        }
    }

    private static String unzip(String zipped) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < zipped.length(); i += 2) {
            char ch = zipped.charAt(i);
            int count = Integer.parseInt(String.valueOf(zipped.charAt(i + 1)));
            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}