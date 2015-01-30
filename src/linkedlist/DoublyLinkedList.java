package linkedlist;

/**
 * Created by manish on 1/2/15.
 */
class DoublyNode {
    DoublyNode next = null;
    DoublyNode prev = null;
    private int data;

    public DoublyNode(int data) {
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

class DoubleLinkList {
    DoublyNode head;

    DoubleLinkList() {
        head = null;
    }

    public boolean isEmpty() {
        if (head == null) return true;
        else return false;
    }

    public int size() {
        DoublyNode current = head;
        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertDoublyLink(int data, int position) {
        DoublyNode newNode = new DoublyNode(data);
        DoublyNode current = head;
        DoublyNode temp = null;
        int size = this.size();

        if (position == 1) {
            if (head == null) {
                head = newNode;
                newNode.next = null;
                newNode.prev = null;
            } else {
                head.prev = newNode;
                newNode.next = head;
                head = newNode;
                newNode.prev = null;
            }
        } else if (position >= 2 && position <= size) {
            current = head;

            // insert at a position
            for (int i = 1; i < position; i++) {
                current = current.next;
            }
            temp = current.prev;
            current.prev.next = newNode;
            newNode.next = current;
            current.prev = newNode;
            newNode.prev = temp;
        } else if (position == (size + 1)) {
            current = head;
            for (int i = 2; i < position; i++) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
            newNode.next = null;
        } else if (position < 1 || position > size + 1) {
            System.out.println("The position is invalid and you cannot insert the data item");
        }
    }

    public void deleteDoublyLinkByData(int data) {

        DoublyNode current = head;
        DoublyNode temp = null;

        if (head == null) {
            System.out.println("The list is empty");
        }

        while (current.getData() == data) {
            current = current.next;
            head = current;
            current.prev = null;
        }

        temp = current.next;

        while (current != null) {
            if (current.getData() == data) {

                if (current.next == null) {
                    current.prev.next = null;
                }

                if (current.next != null) {
                    temp = current.next;
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                    current.next = null;
                    current.prev = null;
                }
                current = temp;
            } else
                current = current.next;
        }
    }

    public void deleteDoublyLinkByPosition(int position) {
        DoublyNode current = head;

        if (position == 1) {
            current = current.next;
            head = current;
            if (current.prev != null) current.prev = null;
        } else if (position > 1 && position < this.size()) {
            for (int i = 1; i < position; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            current.next = null;
            current.prev = null;
        } else if (position == this.size()) {
            for (int i = 1; i < position; i++) {
                current = current.next;
            }
            current.prev.next = null;
        } else if (position < 1 || position > this.size()) {
            System.out.println("The position is invalid");
        }
    }

    public boolean findDoublyLink(int data) {
        DoublyNode current = head;
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
        DoublyNode current = head;

        while (current.next != null) {
            current = current.next;
            head = current;
            current.prev = null;
        }
        head = null;
    }

    public void displayList() {
        DoublyNode current = head;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }

    public void displayListReverse() {
        DoublyNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        while (current != null) {
            current.displayLink();
            current = current.prev;
        }
    }

}


public class DoublyLinkedList {
    public static void main(String[] args) {
        DoubleLinkList dl = new DoubleLinkList();

        System.out.println("Is the linked list empty? " + dl.isEmpty());
        System.out.println("Size of the List: " + dl.size());

        dl.insertDoublyLink(11, 1);
        dl.insertDoublyLink(22, 2);
        dl.insertDoublyLink(33, 3);
        dl.insertDoublyLink(44, 4);
        dl.insertDoublyLink(55, 5);

        dl.displayList();
        System.out.println();

        System.out.println("Size of the List: " + dl.size());

        dl.insertDoublyLink(11, 3);
        dl.insertDoublyLink(77, 2);
        dl.insertDoublyLink(88, 7);
        dl.insertDoublyLink(99, 9);
        dl.insertDoublyLink(11, 1);
        dl.insertDoublyLink(11, 1);
        dl.insertDoublyLink(11, 2);
        dl.insertDoublyLink(11, 1);
        dl.insertDoublyLink(11, 14);

        dl.displayList();
        System.out.println();

        System.out.println("Size of the List: " + dl.size());

        dl.deleteDoublyLinkByData(11);

        dl.displayList();
        System.out.println();

        System.out.println("Size of the List: " + dl.size());

        dl.deleteDoublyLinkByPosition(1);
        dl.displayList();
        System.out.println();

        System.out.println("Size of the List: " + dl.size());

        dl.deleteDoublyLinkByPosition(3);
        dl.displayList();
        System.out.println();

        System.out.println("Size of the List: " + dl.size());

        dl.deleteDoublyLinkByPosition(5);
        dl.displayList();
        System.out.println();

        System.out.println("Size of the List: " + dl.size());

        dl.findDoublyLink(88);

        dl.deleteList();

        dl.displayList();
        System.out.println();

        System.out.println("Size of the List: " + dl.size());
    }
}
