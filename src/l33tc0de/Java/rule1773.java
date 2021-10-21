package l33tc0de.Java;

import java.util.List;

public class rule1773 {
    class Solution {
        public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
            int index=0,count=0;
            if(ruleKey.equals("color")){
                index=1;
            }else if(ruleKey.equals("name")){
                index=2;
            }

            for(List<String> rows : items){
                if((rows.get(index)).equals(ruleValue)  ) {
                    count++;
                }
            }
            return count;
        }
    }

}
