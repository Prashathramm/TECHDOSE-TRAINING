//package Heap.Homeworks;
import java.util.Scanner;
import java.util.Random;
public class MaxHeapImplementation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        MaxHeap heap=new MaxHeap(size);
        Random rand=new Random();
        for(int i=0;i<size;++i) {
            int val=rand.nextInt(30);
            //System.out.println(val);
            heap.insert(val);
        }
        System.out.println("Maximum value "+heap.getMax());
        heap.extractMax();
        heap.print();
    }
}
class MaxHeap {
    int[] arr;
    int size;
    int currIdx;
    MaxHeap(int size) {
        this.size=size;
        arr=new int[this.size];
        currIdx=0;
    }
    public void insert(int value) {
        arr[currIdx]=value;
        percolateUp(currIdx);
        currIdx+=1;
    }
    public void percolateUp(int idx) {
        // condition 1: traverse until root node
        // condition 2: traverse only if parent is less than current node
        while(idx>0 && arr[idx>>1]<arr[idx]) {
            swap(idx>>1,idx);
            idx>>=1;
        }
    }
    public void swap(int a,int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public int getMax() {
        return arr[0];
    }
    public boolean extractMax() {
        if(currIdx==0) {
            return false;
        }
        arr[0]=arr[--currIdx];
        maxHeapify(0); // percolateDown
        System.out.println("INDEX: "+currIdx);
        return true;
    }
    // percolateDown
    public void maxHeapify(int idx) {
        int largest=idx;
        int leftChild=2*idx+1,rightChild=2*idx+2;
        if(leftChild<size && arr[leftChild]>arr[largest]) {
            largest=leftChild;
        }
        if(rightChild<size && arr[rightChild]>arr[largest]) {
            largest=rightChild;
        }
        if(largest!=idx) {
            swap(largest,idx);
            maxHeapify(largest);
        }
    }
    public void print() {
        for(int i=0;i<((size-1)>>1);++i) {
            int parent=arr[i];
            int l_child=arr[2*i+1],r_child=arr[2*i+2];
            System.out.printf("Parent:%d -> Left Child:%d Right Child:%d\n", parent,l_child,r_child);
        }
    }
}
