import java.util.Arrays;

public class Array3 {

    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(getArrayMiddle(numbers)));
    }

    public static int[] getArrayMiddle(int[] numbers){
        int[] temp = new int[2];
        int[] temp2 = new int[1];

        if (numbers.length % 2 == 0){
            temp[0] = numbers[numbers.length/2-1];
            temp[1] = numbers[numbers.length/2];
            return temp;
        }else{
            temp2[0] = numbers[numbers.length/2];
            return temp2;
        }
    }
}
//1.5.5