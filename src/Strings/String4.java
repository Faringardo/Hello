package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class String4 {

    public static void main(String[] args) {

        String email = "kata12@gmail.com";

        System.out.println(isGmailOrOutlook(email));
    }

    public static boolean isGmailOrOutlook(String email){

        String regex = "\\w{1,}@\\w{5}.\\w{3}";

        return email.matches(regex);
    }
}
//1.6.10
