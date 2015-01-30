package linkedlist;

/**
 * Created by manish on 1/6/15.
 */
public class RotateList {

    public static ListNode rotateRight(ListNode head, int n) {
        ListNode current = head;
        ListNode prev = null;
        ListNode tail = head;
        ListNode temp = head;
        int count = 0;

        if(head == null || head.next == null) return head;

        while(tail.next != null){
            tail = tail.next;
        }

        while(temp != null){
            count++;
            temp = temp.next;
        }

        if(n == 0) return head;

        if(n < count){
            for(int i=1; i <= (count-n); i++){
                prev = current;
                current = current.next;
            }
            prev.next = null;
            tail.next = head;
            head = current;
            return head;
        }
        if(n == count){
            return head;
        }

        if(n > count) {
            n = n - count;
            for (int i = 1; i <= (count - n); i++) {
                prev = current;
                current = current.next;
            }
            prev.next = null;
            tail.next = head;
            head = current;
            return head;

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

        System.out.println(rotateRight(head,9));

    }

}
