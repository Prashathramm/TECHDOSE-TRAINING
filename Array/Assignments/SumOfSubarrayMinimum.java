package Array.Assignments;
import java.util.*;
public class SumOfSubarrayMinimum {
    int mod=(int)1e9+7;
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer>stk=new Stack<>();
        stk.push(-1);
        int res=0,val=0;
        for(int i=0;i<=arr.length;++i) {
            if(i==arr.length) {
                val=0;
            } else {
                val=arr[i];
            }
            while(stk.peek()!=-1 && arr[stk.peek()]>val) {
                // current index
                int idx=stk.pop();
                // last smallest element's index
                int lsi=stk.peek();
                // smallest element's index after popped element (i.e current index)
                int rsi=i;
                // count of left subarrays that includes the popped element
                int tot_left_subArrays=idx-lsi;
                // count of right subarrays that includes the popped element
                int tot_right_subArrays=rsi-idx;
                // (total count of arrays that includes popped element) * (popped element)
                res+=((tot_left_subArrays*tot_right_subArrays)*((long)arr[idx])%mod);
                res%=mod;
            }
            stk.push(i);
            
        }
        return res%mod;
    }
    
}
