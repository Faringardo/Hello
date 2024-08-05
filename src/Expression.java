public class Expression {

    public static void main(String[] args) {

        int a = 5;

        System.out.println(charExpression(a));
    }

    public static char charExpression(int a){

        char value = (char) ('\\' + a);
        return value;
    }
}
//1.3.2