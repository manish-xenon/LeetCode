package linkedlist;

/**
 * Created by manish on 12/31/14.
 */

class Node {
    private int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public void displayLink() {
        System.out.print(data + " ");
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

class SingleLinkList {
    Node head;

    SingleLinkList() {
        head = null;
    }

    public boolean isEmpty() {
        if (head == null) return true;
        else return false;
    }

    public int size() {
        Node current = head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertLink(int data, int position) {
        Node newNode = new Node(data);
        Node prev = null;
        Node current = head;
        int size = this.size();

        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else if (position >= 2 && position <= size + 1) {

            // insert at a position
            for (int i = 1; i < position; i++) {
                prev = current;
                current = current.next;

            }
            newNode.next = current;
            prev.next = newNode;
        } else if (position < 1 || position > size + 1) {
            System.out.println("The position is invalid and you cannot insert the data item");
        }
    }

    public Node deleteLinkByData(int data) {
        Node prev = null;
        Node current = head;
        Node temp = null;

        // if the first Link has to be deleted
        while (head.getData() == data) {
            temp = current;
            current = current.next;
            head = current;
        }
        // else the data to be deleted is not the first link

        while (current != null) {
            if (current.getData() == data) {
                temp = current;
                prev.next = current.next;
            }
            prev = current;
            current = current.next;
        }

        return temp;
    }

    public Node deleteLinkByPosition(int position) {
        Node prev = null;
        Node current = head;
        Node temp = null;

        if (position >= 1 && position <= this.size()) {
            if (position == 1) {
                temp = current;
                head = current.next;
            } else {
                for (int i = 1; i < position; i++) {
                    prev = current;
                    current = current.next;
                }
                temp = current;
                prev.next = current.next;
            }
        } else if (position < 1 || position > this.size()) {
            System.out.println("The position is invalid");
        }
        return temp;
    }

    public boolean findLink(int data) {
        Node current = head;
        boolean present = false;
        while (current != null) {
            if (current.getData() == data) {
                present = true;
                break;
            }
            current = current.next;
        }
        if (present) System.out.println("Item " + data + " is found");
        else System.out.println("Item " + data + " is not found");
        return present;
    }

    public void deleteList() {
        Node current = head;
        while(current!=null) {
            head = current.next;
            current = head;
        }
    }

    public void displayList() {
        Node current = head;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        SingleLinkList sl = new SingleLinkList();

        System.out.println("Is the linked list empty? " + sl.isEmpty());
        System.out.println("Size of the List: " + sl.size());

        sl.insertLink(5, 1);
        sl.insertLink(10, 2);
        sl.insertLink(15, 3);
        sl.insertLink(20, 4);
        sl.insertLink(25, 5);

        sl.displayList();
        System.out.println();

        System.out.println("Size of the List: " + sl.size());

        sl.insertLink(50, 2);

        sl.displayList();
        System.out.println();

        System.out.println("Size of the List: " + sl.size());

        sl.insertLink(50, 7);

        sl.displayList();
        System.out.println();

        System.out.println("Size of the List: " + sl.size());

        Node test = sl.deleteLinkByData(5);
        sl.displayList();
        System.out.println();

        System.out.println("Size of the List: " + sl.size());

        test = sl.deleteLinkByData(15);
        sl.displayList();
        System.out.println();

        System.out.println("Size of the List: " + sl.size());

        sl.insertLink(50, 1);
        sl.insertLink(50, 1);
        sl.insertLink(50, 1);

        sl.displayList();
        System.out.println();

        test = sl.deleteLinkByData(50);
        sl.displayList();
        System.out.println();

        System.out.println("Size of the List: " + sl.size());

        sl.insertLink(50, 1);
        sl.insertLink(70, 1);
        sl.insertLink(100, 1);

        sl.displayList();
        System.out.println();

        test = sl.deleteLinkByPosition(1);
        sl.displayList();
        System.out.println();

        test = sl.deleteLinkByPosition(2);
        sl.displayList();
        System.out.println();

        test = sl.deleteLinkByPosition(4);
        sl.displayList();
        System.out.println();

        test = sl.deleteLinkByPosition(4);
        sl.displayList();
        System.out.println();

        boolean present = sl.findLink(70);

        present = sl.findLink(100);

        System.out.println("List is Empty? " + sl.isEmpty());

        sl.deleteList();
        sl.displayList();
        System.out.println();
        System.out.println("List is Empty? " + sl.isEmpty());
        System.out.println("Size of the List: " + sl.size());

    }
}
