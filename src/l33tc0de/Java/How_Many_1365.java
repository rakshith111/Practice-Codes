package l33tc0de.Java;

import java.util.Arrays;

public class How_Many_1365 {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int siz=nums.length;
        int[] res =new int[siz];
        int i,curr,k;
        for(i=0;i<siz;i++){
            curr=nums[i];
            k=0;
            res[i]=k;
            for (int num : nums) {
                if(num<curr) res[i]=++k;
            }

        }

    return  res;
    }

    public static void main(String[] args) {
        int [] nums={8,1,2,2,3};
        int[] res=smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(res));

    }
}
