import java.util.Arrays;

import static java.lang.System.arraycopy;

public class MidArray {

    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,8,9,10};
        int [] temp = new int[2 - numbers.length % 2];

        if (numbers.length % 2 == 0){
            System.arraycopy(numbers,numbers.length / 2 - 1,temp,0,temp.length);
            System.out.println(Arrays.toString(temp));
        }else {
            System.arraycopy(numbers,numbers.length / 2,temp,0,temp.length);
            System.out.println(Arrays.toString(temp));
        }
    }
}
//1.5.10