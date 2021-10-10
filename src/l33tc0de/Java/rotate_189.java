package l33tc0de.Java;

// unsolved
import java.util.Arrays;

public class rotate_189 {
    public static int[] nums;

    public  static void rotate(int[] nums, int k) {
        int siz=nums.length;
        if(siz!=1) {
            int[] start = Arrays.copyOfRange(nums, siz - k, siz);
            int[] end = Arrays.copyOfRange(nums, 0, siz - k);
            int pos = 0;
            for (int i : start) {
                nums[pos] = i;
                pos++;
            }
            for (int i : end) {
                nums[pos] = i;
                pos++;
            }
        }


        System.out.println(Arrays.toString(nums));

    }

    public static void main(String[] args) {
         nums = new int[]{-1,2 };
        rotate(nums,3);
       // System.out.println(Arrays.toString(nums));
    }
}
