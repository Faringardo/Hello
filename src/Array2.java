import java.util.Arrays;

public class Array2 {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int start = 2;
        int end = 6;

        System.out.println(Arrays.toString(getSubArrayBetween(numbers, start, end)));
    }

    public static int[] getSubArrayBetween(int[] numbers, int start, int end){

        int[] result = new int[end - start + 1];

        for(int i = 0; i < numbers.length; i++){

            if (numbers[i] >= start && numbers[i] <= end){
                result[i-1] += numbers[i];
            }
        }
        return result;
    }
}
//1.5.4