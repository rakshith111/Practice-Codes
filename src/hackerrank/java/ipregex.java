package hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;


import static java.util.regex.Pattern.*;

public class ipregex {
    private static void MyRegex(String ip) {
        String match="(\\d{1,2}|[01]\\d\\d|2[0-4]\\d|25[0-5])";

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
