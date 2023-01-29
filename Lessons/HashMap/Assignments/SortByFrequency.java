package Lessons.HashMap.Assignments;
import java.util.*;
public class SortByFrequency {
    public String frequencySort(String s) {
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        int[] arr=new int[128];
        for(char ch:s.toCharArray()) {
            arr[ch]++;
        }
        for(int i=0;i<arr.length;++i) {
            if(arr[i]>0) {
                pq.add(new Pair((char)(i),arr[i]));
            }
        }
        StringBuilder res=new StringBuilder();
        while(!pq.isEmpty()) {
            res.append((pq.peek().ch+"").repeat(pq.peek().fre));
            pq.remove();
        }
        return res.toString();
    }   
}
class Pair implements Comparable<Pair> {
    char ch;
    int fre;
    Pair(char a,int b) {
        ch=a;
        fre=b;
    }
    @Override 
    public int compareTo(Pair other) {
        return other.fre-this.fre;
    }
}
