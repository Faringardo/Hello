package OOP_and_packet;

public class Enum {

    public enum Day {
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");

        private final String rusName;

        Day(String rusName) {
            this.rusName = rusName;
        }

        public boolean isWeekend() {
            return this == SATURDAY || this == SUNDAY;
        }

        public String getRusName() {
            return rusName;
        }
    }
    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        System.out.println("Сегодня: " + today.getRusName());
        System.out.println("Выходной? " + today.isWeekend());
    }
}
//2.1.7
