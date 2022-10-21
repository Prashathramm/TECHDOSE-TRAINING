package LinkedList.Assignments;

public class LoopDetectionInLL {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode s=head,f=head;
        while(f!=null && f.next!=null) {
            f=f.next;
            s=s.next;
            if(f!=null) f=f.next;
            if(s==f) return true;
        }
        return false;
    }
    
}
