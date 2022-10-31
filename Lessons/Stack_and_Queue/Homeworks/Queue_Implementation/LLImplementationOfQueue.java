package Stack_and_Queue.Homeworks.Queue_Implementation;
import java.util.*;
public class LLImplementationOfQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        LL node=new LL();
        for(int i=0;i<size;++i) {
            int element=sc.nextInt();
            node.push(element);
        }
        System.out.println("The first added element: "+node.pop());
        System.out.println("The top element: "+node.peek());
        sc.close();
    }
}
class LL {
    Node node;
    LL() {
        node=new Node();
    }
    public boolean push(int val) {
        if(node==null) {
            node.val
        }
    }
}
class Node {
    int val;
    Node next;
}