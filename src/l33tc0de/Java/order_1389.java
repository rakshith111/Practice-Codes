package l33tc0de.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class order_1389
{
    public static int[] createTargetArray(int[] nums, int[] index) {
        int len= nums.length;
        List<Integer> reslist = new ArrayList<>();
        int [] arr = new int[len];
        for(int i=0;i<len;i++){
            reslist.add(index[i],nums[i]);
        }
        for (int i = 0; i < len; i++)
            arr[i] = reslist.get(i);
        return arr;

}

    public static void main(String[] args) {
        int [] nums={0,1,2,3,4};
        int [] indexs= {0,1,2,2,1};
        int[] res=createTargetArray(nums,indexs);
        System.out.println(Arrays.toString(res));

    }
}
