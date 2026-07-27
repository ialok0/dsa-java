package HashMap;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        int longest = 0;

        if(n==0){
            return 0;
        }
        Set<Integer> st = new HashSet<>();

        for (int num : nums) {
            st.add(num);
        }

        for(int num:nums){
            if(!st.contains(num-1)){
                int count = 1;
                int x = num;

                while(st.contains(x+1)){
                    x = x + 1;
                    count = count + 1;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}
