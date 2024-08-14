import java.math.BigInteger;

public class factorial2 {

    public static void main(String[] args) {

        int value = 8;

        System.out.println(factorial(value));
    }

    public static BigInteger factorial(int value) {

        BigInteger factor = new BigInteger("1");
        for (int i = 2; i <= value; i++)
            factor = factor.multiply(BigInteger.valueOf(i));
        return factor;
    }
}
//1.4.7