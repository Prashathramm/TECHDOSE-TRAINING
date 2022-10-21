package LC_Medium2;
import java.util.*;
public class BW_59 {
    int mod=(int)1e9+7;
    public int countPaths(int n, int[][] roads) {
        List<List<Node>>adj=new ArrayList<>();
        int[] res=new int[n];
        res[0]=1;
        for(int i=0;i<n;++i) {
            adj.add(new ArrayList<>());
        }
        for(int[] a:roads) {
            adj.get(a[0]).add(new Node(a[2],a[1]));
            adj.get(a[1]).add(new Node(a[2],a[0]));
        }
        int[] dis=new int[n];
        
        // adj representation
        // [[{Node},{Node},{Node}],[{Node}],[{Node}]]
        //            0               1        2
        // Direct Connections from every vertex with {dis,connected vertex}

        for(int i=1;i<n;++i)
            dis[i]=Integer.MAX_VALUE;
        PriorityQueue<Node>pq=new PriorityQueue<>();
        pq.add(new Node(0,0));
        while(!pq.isEmpty()) {
            Node temp=pq.remove();
            for(Node nei:adj.get(temp.node)) {
                if(temp.dis+nei.dis<dis[nei.node]) {
                    dis[nei.node]=temp.dis+nei.dis;
                    res[nei.node]=res[temp.node]%mod;
                    pq.add(new Node(dis[nei.node],nei.node));
                } else if(temp.dis+nei.dis==dis[nei.node]) {
                    res[nei.node]=(res[temp.node]%mod)+(res[nei.node]%mod)%mod;
                }
            }
        }
        return res[n-1]%mod;
    }
}
class Node implements Comparable<Node> {
    int dis,node;
    Node(int dis,int node) {
        this.dis=dis;
        this.node=node;
    }
    @Override
    public int compareTo(Node other) {
        return this.dis-other.dis;
    }
}
