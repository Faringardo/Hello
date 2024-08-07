import java.math.BigInteger;

public class factorial2 {

    public static void main(String[] args) {

        int value = 4;

        System.out.println(factorial(value));
    }

    public static BigInteger factorial(int value) {

        int result = 1;
        if (value == 0 || value == 1) {
            return BigInteger.ONE;
        }else{
            for (int i = 1; i <= value; i++) {
                result = (result * i);
            }
            return BigInteger.valueOf(result);
        }
    }
}
//1.4.7