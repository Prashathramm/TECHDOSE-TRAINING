package LinkedList.Assignments;

public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp=head,pre=null;
        while(temp!=null) {
            if(pre!=null) {
                if(temp.val==pre.val) {
                    if(temp.next==null) {
                        pre.next=null;
                        return head;
                    } else {
                        pre.next=temp.next;
                    }
                } else {
                    pre=temp;
                }
                temp=pre.next;
            } else {
                pre=temp;
                temp=temp.next;
            }
        }
        return head;
    }
    
}
