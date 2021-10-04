package l33tc0de;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Concatenation_Array {
    static class Solution {
        public static int[] buildArray(int[] nums) {
            int siz = nums.length,c=0;
            int[] res = new int[2*siz];
            while (c < 2 * siz) for (int num : nums) res[c++] = num;
            return res;
        }

        public static void main(String[] args) {
            int[] arr = {1, 2, 1};
            int[] res;
            res = Solution.buildArray(arr);
            System.out.println(Arrays.toString(res));

        }
    }
}

