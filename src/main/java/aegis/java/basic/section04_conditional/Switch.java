package aegis.java.basic.section04_conditional;

public class Switch {
    public static void main(String[] args) {
        var a = 1;

        switch (a) {
            case 1: {
                System.out.println("1");
                break;
            }
            case 2: {
                System.out.println("2");
                break;
            }
            case 3: {
                System.out.println("3");
                break;
            }
            default: {
                System.out.println("default");
                break;
            }
        }
        //
        // Jan, Fer, Mar, Apr, May, Jun, Jul, Aug, Sep, Oct, Nov, Dec
        // 1,   2,   3,   4,   5,   6,   7,   8,   9,   10,  11,  12

        var mounth = 3;
        switch (mounth) {
            case 1:
            case 2:
            case 12: {
                System.out.println("Winter");
                break;
            }
            case 3:
            case 4:
            case 5: {
                System.out.println("Spring");
                break;
            }
            case 6:
            case 7:
            case 8: {
                System.out.println("Summer");
                break;
            }
            case 9:
            case 10:
            case 11: {
                System.out.println("Autumn");
                break;
            }
            default: {
                System.out.println("Error number, try again");
                break;
            }
        }

        //

        if (mounth == 1 || mounth == 2 || mounth == 12) {
            System.out.println("winter");
        } else if (mounth == 3 || mounth == 4 || mounth == 5) {
            System.out.println("Spring");
        } else if (mounth == 6 || mounth == 7 || mounth == 8) {
            System.out.println("Summer");
        } else if (mounth == 9 || mounth == 10 || mounth == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Unsupported mount number: " + mounth);
        }
    }
}
