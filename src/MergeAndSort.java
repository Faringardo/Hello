import java.util.Arrays;

public class MergeAndSort {

    public static void main(String[] args) {

        int[] firstArray = {1, 3, 5, 7};
        int[] secondArray = {2, 4, 6, 8};

        int[] result = new int[firstArray.length + secondArray.length];

        System.arraycopy(firstArray, 0, result, 0, firstArray.length);
        System.arraycopy(secondArray, 0, result, firstArray.length, firstArray.length);

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
//1.5.11