package LC_Medium2;

public class BW_62 {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n=answerKey.length();
        return Math.max(rec(answerKey,'T',k),rec(answerKey,'F',k));
    }
    public int rec(String s,char ch,int k) {
        int w=0,ans=0,j=0;
        for(int i=0;i<s.length();++i) {
            char c=s.charAt(i);
            if(c==ch) {
                w++;
            }
            if(w>k) {
                while(j<=i && w>k) {
                    if(s.charAt(j)==ch) w--;
                    j++;
                }
            }
            ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
    
}
