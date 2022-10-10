class Solution {
    public int[][] kClosest(int[][] points, int k) {
        double[] p=new double[2];
        int[][] res=new int[k][2];
        List<double[]>l=new ArrayList<>();
        int j=0;
        for(int[] i:points) {
            double val=Math.sqrt((i[0]*i[0])+(i[1]*i[1]));
            l.add(new double[]{(double)j,val});
            j++;
        }
        Collections.sort(l,(a,b)->{
            double x=a[1],y=b[1];
            return (x<y)?-1:1;
        });
        for(int i=0;i<k;++i) {
            int[] temp=points[(int)l.get(i)[0]];
            res[i][0]=temp[0];
            res[i][1]=temp[1];
        }
        return res;
    }
}