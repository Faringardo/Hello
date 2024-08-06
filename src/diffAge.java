public class diffAge {

    public static void main(String[] args) {

        byte age1 = 9;
        byte age2 = 15;

        System.out.println(getAgeDiff(age1, age2));
    }
    public static byte getAgeDiff(byte age1, byte age2){

        return (byte) Math.abs(age1 - age2);
    }
}
//1.3.3