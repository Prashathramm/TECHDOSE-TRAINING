package LinkedList.Assignments;

public class Reverse2 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null || left==right) return head;
        ListNode temp=head,n=null,last=null,first=null;
        int cnt=0,f=1;
        while(temp!=null) {
            cnt++;
            if(cnt>=left && cnt<=right) {
                if(f==1) {
                    last=temp;
                    f=0;
                }
                ListNode t=temp.next;
                temp.next=n;
                n=temp;
                temp=t;
            } else if(f==1) {
                first=temp;
                temp=temp.next;
            } else {
                last.next=temp;
                break;
            }
        }
        if(temp==null) last.next=null;
        if(left>1) first.next=n;
        if(left==1) head=n;
        return head;
    }
    
}
