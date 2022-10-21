package Matrix.Assignments;

public class KthSmallestElementInSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        int r=matrix.length,c=matrix[0].length;
        int res=0;
        int l=matrix[0][0],h=matrix[r-1][c-1];
        while(l<=h) {
            int m=l+(h-l)/2;
            int cnt=c(m,matrix);
            if(cnt>=k) {
                res=m;
                h=m-1;
            } else {
                l=m+1;
            }
        }
        return res;
    }
    public int c(int m,int[][] matrix) {
        int l=0,r=matrix[0].length-1;
        int ret=0;
        while(l<matrix.length && r>-1) {
            if(matrix[l][r]<=m) {
                ret+=(r+1);
                l+=1;
            } else {
                r-=1;
            }
        }
        return ret;
    }

    
}
