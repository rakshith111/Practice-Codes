package hackerrank;

import java.util.Scanner;


import static java.util.regex.Pattern.*;

public class ipregex {
    private static void MyRegex(String ip) {
        if (compile("\\.").matcher(ip).results().count() != 3) {
            System.out.println("false");
        } else {
            String[] res = ip.split("[.]", 0);
            int count = 0;
            for (String s : res) {
                if (Integer.parseInt(s) <= 255 && Integer.parseInt(s) >= 0 && s.length() <= 3) {
                    count += 1;
                }
            }
            if (count == 4) {
                System.out.println("true");
            } else System.out.println("false");

        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            MyRegex(scan.next());

        }
    }
}
