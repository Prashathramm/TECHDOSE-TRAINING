package LinkedList.Assignments;

public class Reverse {
    public ListNode reverseList(ListNode head) {
        ListNode pre=null;
        while(head!=null) {
            ListNode temp=head;
            head=temp.next;
            temp.next=pre;
            pre=temp;
        }
        return pre;
    }
    
}
