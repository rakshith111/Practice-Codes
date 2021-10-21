package l33tc0de.Java;

import java.util.Arrays;

import static l33tc0de.Java.rotate_189.nums;

public class index34 {
    public static void main(String[] args) {
        int [] nums={5,7,7,8,8,10};
        int target =6;
        int [] res=searchRange(nums,target);
        System.out.println(Arrays.toString(res));

    }
    public static int[] searchRange(int[] nums, int target) {
        int [] res={-1,-1};
        int len=nums.length;
       for(int i=0;i<len;i++){
            if(nums[i]==target){
                res[0]=i;
                break;
            }
        }
    if(res[0]!=-1) {
        for (int te = res[0]; te < len; te++) {
            if (nums[te] == target) {
                res[1] = te;
            }
        }
    }

        return res;
    }
}
