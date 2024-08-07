import java.math.BigInteger;

public class factorial {

    public static void main(String[] args) {
        int value = 5;
        System.out.println(factorial(value));
    }

    public static BigInteger factorial(int value) {

        if (value == 0 || value == 1) {
            return BigInteger.ONE;
        }else {
            return BigInteger.valueOf(value).multiply(factorial(value-1));
        }
    }
}
//1.4.8
