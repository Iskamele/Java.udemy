package aegis.java.basic.section02_structure.theory;

import java.io.File;

public class MKDir {
    public static void main(String[] args) {
        new File(args[0]).mkdir();
    }
}
