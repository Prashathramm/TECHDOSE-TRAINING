package LC_Medium2;

public class WC_268 {
    Map<Integer,List<Integer>>map;

    public RangeFreqQuery(int[] arr) {
        map=new HashMap<>();
        int j=0;
        for(int i:arr) {
            map.computeIfAbsent(i,l->new ArrayList<>()).add(j);
            j++;
        }
    }
    
    public int query(int left, int right, int value) {
        if(map.get(value)==null) return 0;
        List<Integer>temp=map.get(value);
        int fro=Collections.binarySearch(temp,left),to=Collections.binarySearch(temp,right);
        if(fro<0) fro=(fro+1)*-1;
        if(to<0) to=(to+2)*-1;
        return to-fro+1;
        
    }
    
}
