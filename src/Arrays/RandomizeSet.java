package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomizeSet {
    HashMap<Integer,Integer> map;
    ArrayList<Integer> list;
    Random random;

    public RandomizeSet() {
        map     = new HashMap<>();
        list    = new ArrayList<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        list.add(val);
        map.put(val,list.size()-1);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int index = map.get(val);
        int lastIndex = list.size()-1;
        int lastValue = list.get(lastIndex);

        if (index != lastIndex) {
            list.set(index, lastValue);
            map.put(lastValue, index);
        }

        list.remove(lastIndex);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        System.out.println("list -> "+list);
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }
}
