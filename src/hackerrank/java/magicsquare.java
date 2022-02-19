package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Ref;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class magicsquare {
    public  static int getmin(int ele, List<Integer> arr) {
        System.out.println("item got = "+ele);
        if(arr.size()==0) return 0;
        int high=9,index=0,val=0;
        for(int item:arr){
            //System.out.println(" ele "+ele+" item "+item+" diff     "+Math.abs(item-ele));
            if(Math.abs(item-ele)<high){
                val=item;
                index=arr.indexOf((item));
                high=Math.abs(item-ele);
            }
        };


        System.out.println("index "+index+" diff"+high);
        arr.remove(index);
        System.out.println(arr);
        System.out.println("----------------------------------");
        return high;
    }
    class Reference {
        private static List<Integer> evenc= List.of(2, 4, 6, 8);
        private static List<Integer> oddc= List.of(1, 3, 7, 9);
        public static Vector<Integer> even = new Vector<Integer>(evenc);
        public static Vector<Integer> odd = new Vector<Integer>(oddc);
    }
    public static void main(String[] args) {
        //input method
        List<List<Integer>> s = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        IntStream.range(0, 3).forEach(i -> {
            try {
                s.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
//        3 3 4
//        4 5 6
//        1 2 3
    s.forEach(i ->{
        System.out.println(i);
    });

    }
}