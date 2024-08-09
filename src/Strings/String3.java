package Strings;

public class String3 {

    public static void main(String[] args) {

        String text = "Was it a cat I saw?";

        System.out.println(isPalindrome(text));
    }

    public static boolean isPalindrome(String text){

        String s1 = text.replaceAll("[^a-zA-Z0-9]", "");

        if (s1.toLowerCase().equals((new StringBuilder(s1)).reverse().toString().toLowerCase())) {
            return true;
        }else return false;
    }
}
//1.6.9