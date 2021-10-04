package l33tc0de;

import java.util.Arrays;
public class permArray {
    static class Solution {
        public static int[] buildArray(int[] nums) {
            int n=nums.length;
            for (int i=0;i<n;i++) {
                nums[i]=nums[i]+(n*(nums[nums[i]]%n));
            }
            for(int i=0;i<n;i++)
            {
                nums[i]/=n;
            }
            return nums;
        }
    }

        public static void main(String[] args) {
            int [] arr ={0,2,1,5,3,4};
            int [] res;
            res=Solution.buildArray(arr);
            System.out.println(Arrays.toString(res));



        }
    }

