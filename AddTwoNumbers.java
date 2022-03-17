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
        
        int carry=0;
        int tempSum=l1.val+l2.val;
        carry=tempSum/10;
        tempSum=tempSum%10;
        ListNode sum= new ListNode(tempSum, new ListNode());
        while(l1.next!=null|| l2.next!=null){
            l1=l1.next;
            l2=l2.next;
            tempSum=0;
            tempSum=l1.val+l2.val+carry;
            carry=0;
            carry=tempSum/10;
            tempSum=tempSum%10;
            System.out.println(tempSum);
            sum.next= new ListNode(tempSum, new ListNode());
            l1=l1.next;
            l2=l2.next;
        }
        
        tempSum=0;
        tempSum=l1.val+l2.val+carry;
        carry=tempSum/10;
        tempSum=tempSum%10;
        sum.next= new ListNode(tempSum, new ListNode());
        carry=0;
        carry=tempSum/10;
        if(carry!=0)
            sum.next= new ListNode(carry);
        
        return sum;
    }
}
