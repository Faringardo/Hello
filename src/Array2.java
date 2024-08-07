public class Array2 {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int start = 2;
        int end = 6;

        System.out.print("[");
        for(int i = 0; i < numbers.length; i++){

            if (numbers[i] == start){
                System.out.print(numbers[i]);
            }
            if (numbers[i] > start && numbers[i] <= end){
                System.out.print(", " + numbers[i]);
            }
        }
        System.out.println("]");
    }
}
//1.5.4