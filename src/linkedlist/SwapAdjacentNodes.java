package linkedlist;

/**
 * Created by manish on 1/6/15.
 */
public class SwapAdjacentNodes {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = head;
        head = head.next;
        ListNode temp2 = head.next;
        head.next = temp;
        temp.next = swapPairs(temp2);
        return head;
    }

    public static ListNode swapPairsIter(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        while (current != null && current.next != null) {
            ListNode temp = current;
            current = current.next;
            ListNode temp2 = current.next;
            current.next = temp;
            temp.next = temp2;
            if (prev == null) head = current;
            else prev.next = current;
            prev = temp;
            current = temp2;
        }
        return head;
    }

    public static void main(String args[]) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(8);
        System.out.println(head);
        //System.out.println(swapPairs(head));

        System.out.println(swapPairsIter(head));
    }
}
