package AddTwoNumbers;

public class ListNode {
    public int val;
    public ListNode next;
    ListNode () {}
    public ListNode(int val) { this.val = val;}
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode result = new ListNode();
        while (l1.next != null){
            while (l2.next != null){
                result.val = l1.val + l2.val;
                break;

            }
        }
        return result;
    }
}