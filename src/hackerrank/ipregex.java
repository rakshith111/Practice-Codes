package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;


import static java.util.regex.Pattern.*;

public class ipregex {
    private static void MyRegex(String ip) {
        String match="(\\d{1,2}|[01]\\d\\d|2[0-4]\\d|25[0-5])";
        ///               d{1,2} covers for 0~99
        // [01]\d\d  covers for 3 digit 099 and 199 since 1st place can be 1 or 0 and hundreds can be 1 or 0 and rest is 0-9
        //2[0-4]\d covers for anything from 200 to 249
        //25[0-5] covers for 221-225
       match=match+"\\."+match+"\\."+match+"\\."+match;
        if(ip.matches(match)){
            System.out.println("true");
        }else System.out.println("false");

//

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            MyRegex(scan.next());

        }
    }
}
