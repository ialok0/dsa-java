package HashMap;

import java.util.HashMap;
import java.util.Map;
/*
 given string s and t. check s can uniquely map with t.
* */

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character> mapStr = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char ss = s.charAt(i);
            char tt = t.charAt(i);

            if((mapStr.containsKey(ss) && mapStr.get(ss) != tt) ||
                    (!mapStr.containsKey(ss) && mapStr.containsValue(tt))){
                return false;
            }
                mapStr.put(s.charAt(i),t.charAt(i));

        }
        return true;
    }
}
