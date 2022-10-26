package Stack_and_Queue.Assignments;

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>stk=new Stack<>();
        int res=0;
        for(int i=0;i<=heights.length;++i) {
            int currH=(i==heights.length?-1:heights[i]);
            if(stk.isEmpty() || heights[stk.peek()]<=currH) {
                stk.push(i);
            } else {
                int lastH=heights[stk.pop()];
                int w=(stk.isEmpty()?i:i-1-stk.peek());
                res=Math.max(lastH*w,res);
                i-=1;
            }
        }
        return res;
    }
}
