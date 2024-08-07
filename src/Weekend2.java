public class Weekend2 {

    public static void main(String[] args) {

        String weekday = "Sunday";

        System.out.println(isWeekend(weekday));
    }

    public static boolean isWeekend(String weekday){

        if (weekday.equals("Sunday") || weekday.equals("Saturday")){
            return true;
        }else return false;
    }
}
//1.4.11