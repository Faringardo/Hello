import java.math.BigInteger;

public class maxLongSqr {

    public static void main(String[] args) {

        BigInteger maxLong = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger root = maxLong.sqrt();

        System.out.println(root);
    }
}
//1.2.15