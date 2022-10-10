class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1,j=num2.length()-1;
        int sum=0,carry=0;
        Stack<Integer>stk=new Stack<>();
        while(i>=0 && j>=0) {
            int a=num1.charAt(i--)-'0',b=num2.charAt(j--)-'0';
            sum=a+b+carry;
            stk.push(sum%10);
            carry=sum/10;
        }
        while(i>=0) {
            int a=num1.charAt(i--)-'0';
            sum=a+carry;
            stk.push(sum%10);
            carry=sum/10;
        }
        while(j>=0) {
            int b=num2.charAt(j--)-'0';
            sum=b+carry;
            stk.push(sum%10);
            carry=sum/10;
        }
        while(carry>0) {
            stk.push(carry%10);
            carry/=10;
        }
        StringBuilder sb=new StringBuilder();
        while(!stk.isEmpty()) {
            sb.append(stk.pop()+"");
        }
        return sb.toString();
    }
}