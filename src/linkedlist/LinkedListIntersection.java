package linkedlist;

import java.util.HashSet;

/**
 * Created by manish on 1/6/15.
 */
public class LinkedListIntersection {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while (temp1 != null) {
            temp2 = headB;
            while (temp2 != null){

                if (temp1 == temp2) return temp2;
                else temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return temp2;
    }

    public static ListNode getIntersectionNodeHash(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        ListNode answer = null;
        java.util.HashSet <ListNode> hs = new HashSet<ListNode>();

        while(temp1 != null || temp2 != null){
            if(temp1 == temp2)
            {
                answer = temp1;
                break;
            }

            if(temp1 != temp2){
                hs.add(temp1);
                hs.add(temp2);
            }
            if(hs.contains(temp1.next))
            {
                answer = temp1.next;
                break;
            }
            if(hs.contains(temp2.next))
            {
                answer = temp2.next;
                break;
            }

            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return answer;
    }

    public static void main(String args[]) {
        ListNode headA = new ListNode(5);
        headA.next = new ListNode(3);
        headA.next.next = new ListNode(2);
        headA.next.next.next = new ListNode(1);
        headA.next.next.next.next = new ListNode(6);
        headA.next.next.next.next.next = new ListNode(2);
        headA.next.next.next.next.next.next = new ListNode(8);
        ListNode headB = new ListNode(9);
        headB.next = new ListNode(10);
        headB.next.next = new ListNode(11);
        headB.next.next.next = headA.next.next;
        System.out.println(headA);
        System.out.println(headB);

        ListNode answer = getIntersectionNode(headA, headB);
        if(answer == null) System.out.println("Null");
        else answer.displayNodeData();

        ListNode new_answer = getIntersectionNodeHash(headA, headB);
        if(new_answer == null) System.out.println("Null");
        else new_answer.displayNodeData();
    }
}
