class Solution {
    public int maxProfit(int[] prices) {
        Stack<Integer>stk=new Stack<>();
        int l=prices.length,max=0;
        stk.push(prices[0]);
        for(int i=1;i<l;++i) {
            int val=stk.peek();
            if(val<prices[i]) {if(prices[i]-val>max) max=prices[i]-val;}
            else stk.push(prices[i]);
        }
        return max;
    }
}