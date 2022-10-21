package LC_Medium2;
import java.util.*;
public class WC_265 {
    public int minimumOperations(int[] nums, int start, int goal) {
        Queue<Integer>q=new LinkedList<>();
        q.add(start);
        int steps=0;
        boolean[] vis=new boolean[1001];
        while(!q.isEmpty()) {
            int s=q.size();
            while(s-->0) {
                int val=q.remove();
                if(val==goal) {
                    return steps;
                }
                if(val<0 || val>1000 || vis[val]) {
                    continue;
                }
                vis[val]=true;
                for(int i:nums) {
                    q.add(val+i);
                    q.add(val-i);
                    q.add(val^i);
                }
            }
            steps++;
        }
        return -1;
    }
    
}
