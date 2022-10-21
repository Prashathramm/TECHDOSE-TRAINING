package Matrix.Assignments;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>list=new ArrayList<>();
        int r=matrix.length-1,c=matrix[0].length-1;
        int t=0,l=0;
        while(true)
        {
            if(l>c) break;
            for(int i=t;i<=c;++i) list.add(matrix[t][i]);
            t++;
            if(t>r) break;
            for(int i=t;i<=r;++i) list.add(matrix[i][c]);
            c--;
            if(l>c) break;
            for(int i=c;i>=l;--i) list.add(matrix[r][i]);
            r--;
            if(t>r) break;
            for(int i=r;i>=t;--i) list.add(matrix[i][l]);
            l++;
        }
        return list;
        
    }
    
}
