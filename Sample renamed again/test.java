class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if(left==right) return left;
        int b=(int)(Math.log(left)/Math.log(2)+1);
        int p=(1<<(b-1));
        if(p>=left+1 && p<=right) return 0;
        while(right>left) {
            right=right&(right-1);
        }
        return left&right;
    }
}