public class Array3 {

    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6};

             if (numbers.length % 2 == 0){
                 int[] temp = new int[2];
                 temp[0] = numbers[numbers.length/2-1];
                 temp[1] = numbers[numbers.length/2];
                 System.out.println("["+temp[0]+","+temp[1]+"]");
             }else{
                 int[] temp2 = new int[1];
                 temp2[0] = numbers[numbers.length/2];
                 System.out.println("["+temp2[0]+"]");
             }
    }
}
//1.5.5