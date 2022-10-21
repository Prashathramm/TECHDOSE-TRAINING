package LC_Medium2;

public class WC_253 {
    public int minSwaps(String s) {
        int bal=0,cnt=0;
        for(char ch:s.toCharArray()) {
            if(ch=='[') bal++;
            else {
                if(bal>0) bal--;
                else cnt++;
            }
        }
        return (cnt+1)>>1;
    }
    
}
