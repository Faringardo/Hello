import java.util.Arrays;

public class Rev {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9};

        System.out.println(Arrays.toString(inverseArray(numbers)));
    }

    public static int[] inverseArray(int[] numbers){
        if (numbers == null || numbers.length == 0) return numbers;
        int[] rev = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            rev[numbers.length - i - 1] = numbers[i];
        }
        return rev;
    }
}
//1.5.6
//проверка на пустой массив
