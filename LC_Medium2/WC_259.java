package LC_Medium2;
import java.util.*;
public class WC_259 {
    List<int[]>l=new ArrayList<>();
    Map<String,Integer>map=new HashMap<>();

    public DetectSquares() {
        l=new ArrayList<>();
        map=new HashMap<>();
    }
    
    public void add(int[] point) {
        l.add(point);
        String k=point[0]+"-"+point[1];
        map.put(k,map.getOrDefault(k,0)+1);
    }
    
    public int count(int[] point) {
        int res=0;
        for(int[] i:l) {
            if(i[0]!=point[0] && i[1]!=point[1] && Math.abs(point[0]-i[0])==Math.abs(i[1]-point[1])) {
                res+=map.getOrDefault(i[0]+"-"+point[1],0)*map.getOrDefault(point[0]+"-"+i[1],0);
            }
        }
        return res;
    }
    
}
