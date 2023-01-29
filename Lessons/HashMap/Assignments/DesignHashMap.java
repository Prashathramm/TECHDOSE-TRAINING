package Lessons.HashMap.Assignments;
import java.util.*;
public class DesignHashMap {
    int[] array=new int[(int)(1e6+1)];
    public DesignHashMap() {
        Arrays.fill(array,-1);
    }
    
    public void put(int key, int value) {
        array[key]=value;
    }
    
    public int get(int key) {
        return array[key];
    }
    
    public void remove(int key) {
        array[key]=-1;
    }
    
}
