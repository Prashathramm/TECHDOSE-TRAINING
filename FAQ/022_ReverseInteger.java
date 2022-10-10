class Solution {
    public int reverse(int x) {
        if(x==0) return x;
        if(x==Integer.MIN_VALUE || x==Integer.MAX_VALUE) return 0;
        int neg=1;
        String res="";
        if(x<0) {
            neg=-1;
            x*=-1;
        }
        while(x>0) {
            res+=(x%10+"");
            x/=10;
            try {
                int temp=Integer.parseInt(res);
            } catch(Exception e) {return 0;}
        }
        return Integer.parseInt(res)*neg;
    }
}