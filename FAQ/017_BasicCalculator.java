class Solution {
    public int calculate(String s) {
        s=s.trim();
        int sym=1,ans=0;
        Stack<Integer>stk=new Stack<>();
        for(int i=0;i<s.length();++i) {
            char ch=s.charAt(i);
            if(Character.isDigit(ch)) {
                int num=0;
                while(i<s.length() && Character.isDigit(s.charAt(i))) {
                    num=(num*10)+(s.charAt(i)-'0');
                    i++;
                }
                i--;
                ans+=(num*sym);
            } else if(ch=='+') {
                sym=1;
            } else if(ch=='-') {
                sym=-1;
            } else if(ch=='(') {
                stk.push(ans);
                stk.push(sym);
                ans=0;
                sym=1;
            } else if(ch==')') {
                ans=(ans*stk.pop())+stk.pop();
            }
        }
        return ans;
    }
}