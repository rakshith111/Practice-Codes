package hackerrank;

import java.util.Scanner;

public class arraysum {
    public static void ret(int a, int b , int time){
        int sum=a+b;
        for(int j =1; j<time;j++) {
            System.out.print(sum+" ");
            sum += (int) ((Math.pow(2,j))*b);

        }
        System.out.println(sum);
    }
    public static void main(String[] args) {

         Scanner scan = new Scanner(System.in);
         int n= scan.nextInt();
         int a,b,time;
         for(int i =0;i<n;i++){
             a=scan.nextInt();
             b=scan.nextInt();
             time=scan.nextInt();
             ret(a,b,time);

         }
    }
}
//    public static int simpleArraySum(List<Integer> ar) {
//        int sum=0;
//        for(int i :ar){
//            sum=sum+i;
//        }
//        return sum;
//
//    }