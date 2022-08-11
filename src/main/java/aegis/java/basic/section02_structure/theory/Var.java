package aegis.java.basic.section02_structure.theory;

public class Var {
    public static void main(String[] args) {
        var text = "Hello Obsidian!";
        System.out.println(text);
        text = "I hate Obsidian!";
        System.out.println(text);
        text = "Hello " + System.getProperty("user.name");
        System.out.println(text);
    }
}
