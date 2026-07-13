package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatation {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        int right = 0;
        int left = 0;
        char[] s_arr = s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for(; right<s_arr.length; right++){
            int idx = map.getOrDefault(s_arr[right],-1);

            if(idx != -1 && idx >= left){
                ans = Math.max(ans,right-left);
                left= idx + 1;
            }
            map.put(s_arr[right],right);
        }
        return Math.max(ans,right-1);
    }
}
