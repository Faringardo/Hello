public class Array {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        System.out.print("[");
        if (numbers.length >= 1){
            System.out.print(numbers[0]);
        }
        for(int i = 1; i < numbers.length; i++){
            System.out.print(", "+numbers[i]);
        }
        System.out.println("]");
    }
}
//1.5.3