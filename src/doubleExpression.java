public class doubleExpression {

    public static void main(String[] args) {

        double a = 0.1;
        double b = 0.2;
        double c = 0.3;

        System.out.println(expression(a, b, c));
    }

    public static boolean expression(double a, double b, double c) {

        boolean result = Math.abs((a + b) - c) <= 0.0001;

        return result;
    }
}
//1.2.11