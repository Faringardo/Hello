import java.util.Arrays;
import java.util.Collections;

public class MergeArray {

    public static void main(String[] args) {

        int[] firstArray = {1, 3, 5, 7};
        int[] secondArray = {2, 4, 6, 8};

        int[] result = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            result[i] = firstArray[i];
        }
        for (int j = 0; j < secondArray.length; j++) {
            result[firstArray.length + j] = secondArray[j];
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (result[i] < result[j]) {
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
//1.5.7