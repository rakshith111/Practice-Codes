package l33tc0de;

import java.util.Arrays;

public class maxofarofar {
    class Solution {

        public int maximumWealth(int[][] array) {
            int max=0;
            for( int [] arr : array){
                int sum= Arrays.stream(arr).sum();
                max=Math.max(sum,max);

            }
            return max;

        }
    }
}
