public class diffAge {

    public static void main(String[] args) {

        byte age1 = 9;
        byte age2 = 15;

        System.out.println(getAgeDiff(age1, age2));
    }
    public static byte getAgeDiff(byte age1, byte age2){

        byte min = (byte) Math.min(age1, age2);
        byte max = (byte) Math.max(age1, age2);

        byte value = (byte) (max - min);

        return value;
    }
}
//1.3.3