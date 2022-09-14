class Solution {
    public int[][] merge(int[][] inter) {
        Arrays.sort(inter,(a,b)->Integer.compare(a[0],b[0]));
        Stack<Pair>pq=new Stack<>();
        //System.out.println(Arrays.deepToString(inter));
        for(int[] i:inter) {
            int l=i[0],r=i[1];
            if(pq.isEmpty()) {
                pq.add(new Pair(l,r));
            } else {
                int r1=pq.peek().sec;
                if(l>r1) {
                    pq.add(new Pair(l,r));
                } else {
                    Pair p=pq.pop();
                    pq.add(new Pair(p.fir,r1>r?r1:r));
                }
            }
        }
        int[][] res=new int[pq.size()][2];
        int j=0;
        while(!pq.isEmpty()) {
            Pair p=pq.pop();
            res[j][0]=p.fir;
            res[j][1]=p.sec;
            j++;
        }
        Arrays.sort(res,(a,b)->Integer.compare(a[0],b[0]));
        return res;
    }
}
class Pair {
    int fir,sec;
    Pair(int a,int b) {
        fir=a;
        sec=b;
    }
}