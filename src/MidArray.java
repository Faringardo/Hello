import java.util.Arrays;

import static java.lang.System.arraycopy;

public class MidArray {

    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,8,9};

        System.out.println(Arrays.toString(getArrayMiddle(numbers)));
    }

    public static int[] getArrayMiddle(int[] numbers){

        int [] temp = new int[2 - numbers.length % 2];
        int result = 0;
        if (numbers == null || numbers.length == 0) return numbers;
        if (numbers.length % 2 == 0){
            System.arraycopy(numbers,numbers.length / 2 - 1,temp,0,temp.length);
            return temp;
        }else {
            System.arraycopy(numbers,numbers.length / 2,temp,0,temp.length);
            return temp;
        }
    }
}
//1.5.10
//тернарка + пустой массив