package aegis.java.basic.section04_conditional;

public class ConditionalOperators {
    public static void main(String[] args) {
        var day = 1;

        //if else
        if (day == 6 || day == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Workday");
        }

        // Ternary
        System.out.println(day == 6 || day == 7 ? "Weekend" : "Workday");

        // Switch
        switch (day) {
            case 6:
            case 7: {
                System.out.println("Weekend");
                break;
            }
            default:{
                System.out.println("Workday");
            }
        }
    }
}
