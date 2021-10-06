package l33tc0de.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pairs_1512 {
    public static int numIdenticalPairs(int[] nums) {
    int count=0,i=0,curr,siz=nums.length;
    while(i<siz){
        curr=nums[i];
        for(int j =i+1;j<siz;j++) {
            if(nums[j]== curr){
                count++;
            }
        }
        i++;
    }
    return count;
    }

    public static void main(String[] args) {
        int [] nums={1,2,3,1,1,3};
        int res=numIdenticalPairs(nums);
        System.out.println(res);
    }
}
