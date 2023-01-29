package Lessons.HashMap.Assignments;
import java.util.*;
public class InsertDeleteGetRandom {
    Map<Integer,Integer>map;
    Set<Integer>set;
    List<Integer>list;
    Random rand;
    
    public InsertDeleteGetRandom() {
        map=new HashMap<>();
        set=new HashSet<>();
        list=new ArrayList<>();
        rand=new Random();
    }
    
    public boolean insert(int val) {
        if(set.contains(val)) {
            return false;
        }
        set.add(val);
        map.put(val,list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!set.contains(val)) {
            return false;
        }
        set.remove(val);
        int idx=map.get(val),n=list.size();
        if(idx==n-1) {
            list.remove(n-1);
            map.remove(val);
        } else {
            list.set(idx,list.get(n-1));
            map.put(list.get(n-1),idx);
            list.remove(n-1);
        }
        return true;
    }
    
    public int getRandom() {
        int idx=rand.nextInt(list.size());
        return list.get(idx);
    }    
}
