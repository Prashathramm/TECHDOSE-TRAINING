import java.util.*;
public class CatalanNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt(); 
		int[] dp=new int[n];
		rec(dp,n-1,n);
		System.out.println(Arrays.toString(dp));
	}
	public static int rec(int[] dp,int idx,int n) {
	    if(idx<2) dp[idx]=1;
	    if(dp[idx]!=0) return dp[idx];
	    for(int i=0;i<idx;++i) {
	        dp[idx]+=rec(dp,i,n)*rec(dp,idx-i-1,n);
	    }
	    return dp[idx];
	}
}