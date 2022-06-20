package aegis.java.basic.section06_array;

public class WeekDay {
    public static void main(String[] args) {
        // read source data
        var day = 7;

        // processing
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        var result = day >= 1 && day <= 7 ? days[day-1] : "Invalid day: " + day;

        // display results
        System.out.println(result);
    }
}
