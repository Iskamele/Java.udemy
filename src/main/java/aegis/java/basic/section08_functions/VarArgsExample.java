package aegis.java.basic.section08_functions;

public class VarArgsExample {
    public static void main(String[] args) {
        System.out.println(concat());
        System.out.println(concat("Hello"));
        System.out.println(concat("Hello", "World"));
        System.out.println(concat("Hello", " ", "World", "!"));
    }
    //private static String concat(String[] args){
    private static String concat(String...args){
        StringBuilder builder = new StringBuilder();
        for (String arg : args) {
            builder.append(arg);
        }
        return builder.toString();
    }
}
