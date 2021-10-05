package l33tc0de;

import java.util.*;


public class kid_1431 {
    static class Solution {
        public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            List<Boolean> res = new ArrayList<>(candies.length);
            int max=0;
            for(int c :candies){
                max = Math.max(max,c);
            }
            for(int c: candies){
               res.add(c+extraCandies >= max); //* just add the bool vals instead of comparing
            }
            return res;

        }
    }

    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extracad=3;
        List<Boolean> res;
        res=Solution.kidsWithCandies(candies,extracad);
        System.out.println(res);

    }


}
