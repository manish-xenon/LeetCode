//package linkedlist;
//
///**
// * Created by manish on 1/6/15.
// */
//public class ReverseNodesInKPairs {
//
////    public static ListNode reverseKGroup(ListNode head, int k) {
////        ListNode current1 = head;
////        ListNode prev = null;
////        ListNode temp3 = head;
////        ListNode temp4 = null;
////        ListNode current = head;
////        int count = 0;
////        int group = 0;
////        if(head == null) return head;
////
////        while(current1 != null){
////            count++;
////            current1 = current1.next;
////        }
////
////        for(int i=1; i <= (count - (count%k)); i++){
////            temp3 = temp3.next;
////        }
////        if(count > k){
////            temp4 = temp3.next;
////        }
////        else {
////            temp4 = null;
////        }
////
////
////        while (current != temp3) {
////            ListNode temp = current;
////            current = current.next;
////            if (head == null || head.next == null) return head;
//////            if(group == k-1){
//////                k=0;
//////                continue;
//////            }
////
////            if (prev == null) {
////                ListNode temp2 = current.next;
////                current.next = temp;
////                temp.next = temp2;
////                head = current;
////                prev = temp;
////                current = temp2;
////                //group++;
////            } else {
////                temp.next = head;
////                head = temp;
////                prev.next = current;
////                //group++;
////            }
////
////        }
////
////        if(current != null) current.next = temp4;
////        return head;
////    }
//
//        public static ListNode swapPairsInGroup(ListNode head, int k) {
//            int count = 0;
//            if (head == null || head.next == null) return head;
//            while(count == k)
//            ListNode temp = head;
//            head = head.next;
//            ListNode temp2 = head.next;
//            head.next = temp;
//            temp.next = swapPairsInGroup(temp2);
//            return head;
//        }
//
//    public static void main(String args[]) {
//        ListNode head = new ListNode(5);
//        head.next = new ListNode(3);
//        head.next.next = new ListNode(2);
//        head.next.next.next = new ListNode(1);
//        head.next.next.next.next = new ListNode(6);
//        head.next.next.next.next.next = new ListNode(2);
//        head.next.next.next.next.next.next = new ListNode(8);
//        System.out.println(head);
//        System.out.println(reverseKGroup(head, 5));
//    }
//}
