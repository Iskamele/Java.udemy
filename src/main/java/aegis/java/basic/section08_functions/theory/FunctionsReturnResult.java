package aegis.java.basic.section08_functions.theory;

public class FunctionsReturnResult {
    private static int function01 (){
        return 2+4;
    }

    private static int function02(){
        if (2>3){
            return 2;
        }
        for (int i = 0; i < 10; i++) {
            if (i%3==0){
                return 8;
            }
        }
        return function01();
    }

    private static void function03 (){
        // sout current date
    }

}
