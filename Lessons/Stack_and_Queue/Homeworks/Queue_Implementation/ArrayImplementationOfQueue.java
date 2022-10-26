package Stack_and_Queue.Homeworks.Queue_Implementation;
import java.util.*;
public class ArrayImplementationOfQueue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Queue queue=new Queue(size);
        for(int i=0;i<size;++i) {
            int element=sc.nextInt();
            queue.push(element);
        }
        System.out.println("The first added element: "+queue.pop());
        System.out.println("The top element: "+queue.peek());
        sc.close();
    }
}
class Queue {
    int[] arr;
    int size;
    int top;
    int idx;
    Queue(int size) {
        this.size=size;
        arr=new int[this.size];
        top=-1;
        idx=0;
    }
    public boolean push(int val) {
        if(isFull()) {
            return false;
        }
        arr[idx++]=val;
        return true;
    }
    public int pop() {
        if(isEmpty()) {
            return -1;
        }
        int ret=arr[++top];
        for(int i=top+1;i<idx;++i) {
            arr[i-1]=arr[i];
        }
        return ret;
    }
    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return arr[top];
    }
    public boolean isFull() {
        return idx==size-1;
    }
    public boolean isEmpty() {
        return idx==0;
    }
    

}
