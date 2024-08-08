public class Rev {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9};

        System.out.print("[");

        System.out.print(numbers.length);
        for (int i = 1; i < numbers.length; i++) {

            System.out.print(", " + numbers[numbers.length - i - 1]);
        }
        System.out.println("]");
    }
}
//1.5.6
