package FAQ;
class Solution {
    public boolean isValid(String s) {
        Stack<Character>stk=new Stack<>();
        for(char ch:s.toCharArray()) {
            if(ch==')' || ch==']' || ch=='}') {
                char m=ch==')'?'(':ch=='}'?'{':'[';
                if(!stk.isEmpty() && (stk.peek()==m)) stk.pop();
                else return false;
            } else {
                stk.push(ch);
            }
        }
        return stk.isEmpty();
    }
}