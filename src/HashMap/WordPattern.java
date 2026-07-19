package HashMap;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {

        Map<Character,String> mapStr = new HashMap<>();
        String[] ss =s.split(" ");

        if(ss.length!= pattern.length()){
            return false;
        }

        for(int i=0; i<pattern.length(); i++){
            char pp  = pattern.charAt(i);
            String word = ss[i];

            if((mapStr.containsKey(pp) && !mapStr.get(pp).equals(word)) ||
                    (!mapStr.containsKey(pp) && mapStr.containsValue(word))){
                return false;
            }
            mapStr.put(pp,word);

        }
        return true;
    }
}
