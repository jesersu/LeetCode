import AddTwoNumbers.ListNode;
import AddTwoNumbers.Solution;

public class Main {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);;
        l1.next.next = new ListNode(8);

        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(7);

        Solution s = new Solution();
        s.addTwoNumbers(l1,l2);

    }
}