package hackerrank;

import java.util.Scanner;

    public class validregex {
        private static void MyRegex(String name) {
            String match ="(?i)((?=[^0-9])^([a-z]|\\d|\\w[_]\\w){7,30}$)";
            if(name.matches(match)){
                System.out.println("Valid");
            }else System.out.println("Invalid");

        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n=scan.nextInt();
            while (scan.hasNextLine()) {
                MyRegex(scan.next());

            }
        }

}
