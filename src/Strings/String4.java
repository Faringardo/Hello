package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String4 {

    public static void main(String[] args) {

        String email = "kata12@outlook.com";

        System.out.println(isGmailOrOutlook(email));
    }

    public static boolean isGmailOrOutlook(String email){

        String regex = "^[a-zA-Z0-9]+@gmail\\.com$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
//1.6.10
