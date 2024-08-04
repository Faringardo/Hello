public class doubleExpression {

    public static void main(String[] args) {

        double a = 0.1;
        double b = 0.2;
        double c = 0.3;

        System.out.println(expression(a, b, c));
    }

    public static boolean expression(double a, double b, double c) {

        a = c - b;

        return a + b == c;
    }
}
//1.2.11