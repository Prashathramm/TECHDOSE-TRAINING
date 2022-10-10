package Array.Assignments;
import java.util.*;
public class FindMedianFromStream {
    PriorityQueue<Integer>min,max;
    public void MedianFinder() {
        min=new PriorityQueue<>();
        max=new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        max.add(num);
        min.add(max.remove());
        if(max.size()<min.size()) {
            max.add(min.remove());
        }
    }
    
    public double findMedian() {
        return max.size()==min.size()?((double)max.peek()+(double)min.peek())/2:(double)max.peek();
    }
    
}
