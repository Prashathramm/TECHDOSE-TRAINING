package LC_Medium2;
import java.util.*;
public class WC_262 {
    PriorityQueue<int[]>min;
    PriorityQueue<int[]>max;
    Map<Integer,Integer>map;
    int curr;

    public StockPrice() {
        min=new PriorityQueue<>((a,b)->a[1]-b[1]);
        max=new PriorityQueue<>((a,b)->b[1]-a[1]);
        map=new HashMap<>();
        curr=-1;
    }
    
    public void update(int timestamp, int price) {
        curr=Math.max(curr,timestamp);
        map.put(timestamp,price);
        min.add(new int[]{timestamp,price});
        max.add(new int[]{timestamp,price});
    }
    
    public int current() {
        return map.get(curr);
    }
    
    public int maximum() {
        while(!max.isEmpty()) {
            if(max.peek()[1]==map.get(max.peek()[0])) {
                return max.peek()[1];
            } else {
                max.remove();
            }
        }
        return -1;
        
    }
    
    public int minimum() {
        while(!min.isEmpty()) {
            if(min.peek()[1]==map.get(min.peek()[0])) {
                return min.peek()[1];
            } else {
                min.remove();
            }
        }
        return -1;
    }
    
}
