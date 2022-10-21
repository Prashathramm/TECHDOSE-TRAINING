package Stack_and_Queue.Assignments;

public class QueueUsingStack {
    Stack<Integer>stk1,stk2;
    public MyQueue() {
        stk1=new Stack<>();
        stk2=new Stack<>();
    }
    
    public void push(int x) {
        while(!stk2.isEmpty()) stk1.push(stk2.pop());
        stk1.push(x);
    }
    
    public int pop() {
        while(!stk1.isEmpty()) stk2.push(stk1.pop());
        return stk2.pop();
    }
    
    public int peek() {
        while(!stk1.isEmpty()) stk2.push(stk1.pop());
        return stk2.peek();
    }
    
    public boolean empty() {
        return stk1.isEmpty() && stk2.isEmpty();
    }
    
}

