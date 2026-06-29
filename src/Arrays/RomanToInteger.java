package Arrays;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s){
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);

        int result = hm.get(s.charAt(s.length()-1));

        for(int i=s.length()-2; i>=0; i--){
            int num = hm.get(s.charAt(i));
            int beforeNum = hm.get(s.charAt(i+1));

            if(num>=beforeNum){
                result += num;
            }else{
                result -= num;
            }
        }
        return result;
    }
}
