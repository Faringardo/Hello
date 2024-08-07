public class ternary {

    public static void main(String[] args) {
        String weekday = "Friday";

        System.out.println(checkWeekend(weekday));
    }

    public static String checkWeekend(String weekday){
        return (weekday.equals("Sunday") || weekday.equals("Saturday")) ? "Ура, выходной!" : "Надо еще поработать";
    }
}
//1.4.12