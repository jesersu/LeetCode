import AddTwoNumbers.ListNode;

public class Main {
    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        ListNode ll = new ListNode(4);
        ListNode lll = new ListNode(8);

        l1.next = ll;
        l1.next.next = lll;
        while(l1 != null){
            System.out.println("Hello, World!" + l1.val);
            l1 = l1.next;
        }

    }
}