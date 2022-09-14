package FAQ;
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(-1);
        ListNode ret=res;
        ListNode h1=l1,h2=l2;
        int carry=0;
        while(h1!=null && h2!=null) {
            int sum=h1.val+h2.val+carry;
            res.next=new ListNode(sum%10);
            carry=sum/10;
            h1=h1.next;
            h2=h2.next;
            res=res.next;
        }
        while(h1!=null) {
            int sum=h1.val+carry;
            res.next=new ListNode(sum%10);
            carry=sum/10;
            h1=h1.next;
            res=res.next;
        } 
        while(h2!=null) {
            int sum=h2.val+carry;
            res.next=new ListNode(sum%10);
            carry=sum/10;
            h2=h2.next;
            res=res.next;
        }
        while(carry>0) {
            res.next=new ListNode(carry%10);
            carry/=10;
            res=res.next;
        }
        return ret.next;
    }
}