package l33tc0de.Java;

import java.util.ArrayList;
import java.util.List;

public class pairs {
    public static int numIdenticalPairs(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int n : nums) list.add(n);
        int count=0;


        int size=nums.length;
        for(int i=0; i<=size;i++){
            int outval=list.get(i);
            System.out.println("i val="+outval);
            list.remove(0);
            size--;
            for(int j=0;j<size;j++){
                if(outval==list.get(j)){
                    count++;
                    System.out.println("j val "+list.get(j));
                }


                }
            System.out.println("---------------------------------");

        }
        System.out.println(list);
return count;
    }

    public static void main(String[] args) {
        int [] nums={1,1,1,1};
        int res=numIdenticalPairs(nums);
        System.out.println(res);
    }
}
