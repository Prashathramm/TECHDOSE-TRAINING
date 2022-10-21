package LC_Medium2;
import java.util.*;
public class BW_64 {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        List<Integer>l=new ArrayList<>(),c=new ArrayList<>();
        for(int i=0;i<s.length();++i) {
            char ch=s.charAt(i);
            if(ch=='*') {
                l.add(i);
            } else {
                c.add(i);
            }
        }
        int idx=0;
        int[] res=new int[queries.length];
        for(int[] i:queries) {
            int[] arr=g(i[0],i[1],c);
            if(arr[0]>=arr[1]) {
                res[idx++]=0;
                continue;
            }
            int x=c.get(arr[0]),y=c.get(arr[1]);
            int fro=Collections.binarySearch(l,x),back=Collections.binarySearch(l,y);
            if(fro<0) fro=(fro+1)*-1;
            if(back<0) back=(back+2)*-1;
            res[idx++]=back-fro+1;
        }
        return res;
    }
    public int[] g(int x,int y,List<Integer>l) {
        int fro=Collections.binarySearch(l,x),back=Collections.binarySearch(l,y);
        if(fro<0) fro=(fro+1)*-1;
        if(back<0) back=(back+2)*-1;
        return new int[]{fro,back};
    }
    
}
