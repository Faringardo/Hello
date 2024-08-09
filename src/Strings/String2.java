package Strings;

public class String2 {

    public static void main(String[] args) {
        String number = "14213123";

        parseAndPrintNumber(number);
    }

    public static void parseAndPrintNumber(String number){
        int temp = Integer.parseInt(number) / 2;
        System.out.println(temp);
    }
}
//1.6.8