public class Group {

    public static void main(String[] args) {
        int age = 25;
        Determ DG = new Determ();
        System.out.println(DG.determineGroup(age));
    }
}
class Determ{
    public int determineGroup(int age){

        if (age >= 7 && age <= 13){
            return 1;
        }else if (age >= 14 && age <= 17){
            return 2;
        }else if (age >= 18 && age <= 65){
            return 3;
        }
        return -1;
    }
}
//1.4.9