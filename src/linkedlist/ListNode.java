package linkedlist;

/**
 * Created by manish on 1/6/15.
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        if (this == null) return "NULL";
        StringBuilder stringBuilder = new StringBuilder();
        ListNode temp = this;
        while(temp != null) {
            stringBuilder.append(String.valueOf(temp.val) + " -> ");
            temp = temp.next;
        }
        stringBuilder.append("NULL");
        return stringBuilder.toString();
    }

    public void displayNodeData(){
        System.out.println(this.val);
    }
}
