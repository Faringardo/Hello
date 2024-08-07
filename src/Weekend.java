public class Weekend {

    public static void main(String[] args) {
        String weekday = "Sunday";

        System.out.println(isWeekend(weekday));
    }

    public static boolean isWeekend(String weekday){

        switch (weekday){
            case "Saturday", "Sunday": return true;
        }
        return false;
    }
}
//1.4.10