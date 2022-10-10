class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb=new StringBuilder(),res=new StringBuilder();
        Stack<Integer>stk=new Stack<>();
        for(int i=0;i<s.length();++i) {
            char ch=s.charAt(i);
            if(ch=='(') {
                stk.push(i);
            }
            else if(ch==')') {
                if(stk.size()>0) {
                    stk.pop();
                } else {
                    sb.append('#');
                    continue;
                }
            }
            sb.append(ch);
        }
        while(!stk.isEmpty()) {
            sb.setCharAt(stk.pop(),'#');
        }
        for(int i=0;i<sb.length();++i) {
            if(sb.charAt(i)!='#') res.append(sb.charAt(i));
        }
        return res.toString();
    }
}   