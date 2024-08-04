import java.math.BigInteger;

public class maxLongSqr {

    public static void main(String[] args) {

        BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger kvadrat = maxLong.multiply(maxLong);

        System.out.println(kvadrat);
    }
}
//1.2.15