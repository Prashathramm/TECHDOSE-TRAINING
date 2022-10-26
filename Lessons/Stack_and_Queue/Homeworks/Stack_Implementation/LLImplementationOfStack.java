package Stack_and_Queue.Homeworks.Stack_Implementation;
import java.util.*;
public class LLImplementationOfStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        LL node=new LL();
        for(int i=0;i<size;++i) {
            int element=sc.nextInt();
            node.push(element);
        }
        System.out.println("The last added element: "+node.pop());
        System.out.println("The top element: "+node.peek());
        sc.close();
    }
}
class LL {
    Node top;
    LL() {
        top=new Node();
    }
    public boolean push(int val) {
        Node node=new Node();
        node.val=val;
        node.next=top;
        top=node;
        return true; 
    }
    public int pop() {
        int ret=top.val;
        top=top.next;
        return ret;
    }
    public int peek() {
        return top.val;
    }
}
class Node {
    int val;
    Node next;
}
