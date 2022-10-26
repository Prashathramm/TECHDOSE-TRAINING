package Stack_and_Queue.Homeworks.Stack_Implementation;
import java.util.*;
public class ArrayImplementationOfStack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Stack stk=new Stack(size);
        //Random rand=new Random();
        for(int i=0;i<size;++i) {
            int element=sc.nextInt();
            stk.push(element);
        }
        System.out.println("The last added element: "+stk.pop());
        System.out.println("The top element: "+stk.peek());
        sc.close();
    }
}
class Stack {
    int[] arr;
    int size;
    int top;
    Stack(int size) {
        this.size=size;
        arr=new int[this.size];
        top=-1; 
    }
    public boolean push(int val) {
        if(isFull()) {
            return false;
        }
        arr[++top]=val;
        return true;
    }
    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        return arr[top];
    }
    public int pop() {
        if(isEmpty()) {
            return -1;
        }
        return arr[top--];
    }
    public boolean isFull() {
        return top==size-1;
    }
    public boolean isEmpty() {
        return top==-1;
    }
}
