package aegis.java.basic.section04_conditional.practiceMaster;

public class WeekDayWithSwitchMaster {
    public static void main(String[] args) {
        var day = 1;

        String result;
        switch (day){
            case 1: {
                result = "Monday";
                break;
            }
            case 2: {
                result = "Tuesday";
                break;
            }
            case 3: {
                result = "Wednesday";
                break;
            }
            case 4: {
                result = "Thursday";
                break;
            }
            case 5: {
                result = "Friday";
                break;
            }
            case 6: {
                result = "Saturday";
                break;
            }
            case 7: {
                result = "Sunday";
                break;
            }
            default: {
                result = "Invalid day";
                break;
            }
        }
        System.out.println(result);
    }
}
