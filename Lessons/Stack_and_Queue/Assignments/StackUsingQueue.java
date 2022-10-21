package Stack_and_Queue.Assignments;

public class StackUsingQueue {
    Queue<Integer>q1,q2;
    public MyStack() {
        q1=new LinkedList<>();
    }
    
    public void push(int x) {
        q2=new LinkedList<>();
        while(!q1.isEmpty()) {
            q2.add(q1.remove());
        }
        q1.add(x);
        while(!q2.isEmpty()) {
            q1.add(q2.remove());
        }
    }
    
    public int pop() {
        return q1.remove();
    }
    
    public int top() {
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }

    
}

