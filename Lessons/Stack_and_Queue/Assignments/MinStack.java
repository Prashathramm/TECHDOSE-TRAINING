package Stack_and_Queue.Assignments;
public class MinStack {
    Stack<Pair>stk;

    public MinStack() {
        stk=new Stack<>();
    }
    
    public void push(int val) {
        if(stk.isEmpty()) {
            stk.push(new Pair(val,val));
        } else {
            int a=val,b=Math.min(stk.peek().y,val);
            stk.push(new Pair(a,b));
        }
    }
    
    public void pop() {
        stk.pop();
    }
    
    public int top() {
        return stk.peek().x;
        
    }
    
    public int getMin() {
        return stk.peek().y;
        
    }
}
class Pair {
    int x,y;
    Pair(int a,int b) {
        x=a;
        y=b;
    }
}
