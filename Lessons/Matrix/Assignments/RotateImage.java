package Matrix.Assignments;

public class RotateImage {
    public void rotate(int[][] matrix) {
        int r=matrix.length,c=matrix[0].length;
        int m=(r-1)>>1;
        for(int i=0;i<=m;++i) {
            for(int j=0;j<c;++j) {
                int t=matrix[i][j];
                matrix[i][j]=matrix[r-i-1][j];
                matrix[r-i-1][j]=t;
            }
        }
        for(int i=0;i<c;++i) {
            for(int j=i+1;j<r;++j) {
                int t=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=t;
            }
            //System.out.println(Arrays.deepToString(matrix));
        }
    }
    
}
