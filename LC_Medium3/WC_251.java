package LC_Medium3;
public class WC_251 {
    int ans=-1;
    boolean[] vis;
    public int maxCompatibilitySum(int[][] students, int[][] mentors) {
        int n=students.length;
        vis=new boolean[n];
        f(students,mentors,0,0);
        return ans;
    }
    public void f(int[][] s,int[][] m,int idx,int res) {
        if(idx==s.length) {
            ans=Math.max(ans,res);
            return;
        }
        for(int i=0;i<s.length;++i) {
            if(!vis[i]) {
                vis[i]=true;
                int val=0;
                for(int j=0;j<s[idx].length;++j) {
                    if(s[idx][j]==m[i][j]) val++;
                }
                f(s,m,idx+1,res+val);
                vis[i]=false;
            }
        }
    }
}
