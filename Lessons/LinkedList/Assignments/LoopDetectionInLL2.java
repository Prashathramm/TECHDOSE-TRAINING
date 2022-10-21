package LinkedList.Assignments;

public class LoopDetectionInLL2 {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode slow=head,fast=head;
        if(slow.next==null && fast.next==null) return null;
        while(fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next;
            if(fast!=null) 
                fast=fast.next;
            if(slow==fast) {
                break;
            }
        }
        if(slow==fast) {
            fast=head;
            while(slow!=fast) {
                slow=slow.next;
                fast=fast.next;
            }
            return fast;
        }
        return null;
    }
    
}
