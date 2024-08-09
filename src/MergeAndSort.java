import java.util.Arrays;

public class MergeAndSort {

    public static void main(String[] args) {

        int[] firstArray = {1, 3, 5, 7};
        int[] secondArray = {2, 4, 6, 6};

        int[] result = new int[firstArray.length + secondArray.length];

        System.arraycopy(firstArray, 0, result, 0, firstArray.length);
        System.arraycopy(secondArray, 0, result, firstArray.length, firstArray.length);

        Arrays.sort(result);

        System.out.println(Arrays.toString(result));
    }
}
//1.5.11