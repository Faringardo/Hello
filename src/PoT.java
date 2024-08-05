public class PoT {

    public static void main(String[] args) {

        int value = 8;

        System.out.println(isPowerOfTwo(value));
    }
    public static boolean isPowerOfTwo(int value){

        value = Math.abs(value);

        return Integer.bitCount(value) == 1;
    }
}
//1.3.8