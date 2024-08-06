public class Expression {

    public static void main(String[] args) {

        int a = 5;

        System.out.println(charExpression(a));
    }

    public static char charExpression(int a){

        int rev = '\\';
        int value = rev + a;
        return (char) value;
    }
}
//1.3.2