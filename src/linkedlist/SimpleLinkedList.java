package linkedlist;

/**
 * Created by manish on 12/30/14.
 */

class Link{
    private int data;
    public Link next;

    public Link(int data){
        this.data = data;
    }

    public void displayLink(){
        System.out.print(data + " ==> ");
    }
    public int getData(){
        return this.data;
    }
}

class LinkedList {
    private Link first;

    public LinkedList(){
        first = null;
    }

    public boolean isEmpty(){
        if(first == null)
            return true;
        else {
            return false;
        }
    }

    public void insertAtFirst(int data){
        Link newLink = new Link(data);
        newLink.next = first;
        first = newLink;
    }

    public boolean findData(int data){
        if(isEmpty()){
            System.out.println("List is Empty");
            return false;
        }
        Link current = first;
        while(current!= null){
            if(current.getData() == data){
                System.out.println("The item is found");
                return true;
            }
            current = current.next;
        }
        System.out.println("The item is not found");
        return false;
    }

    public Link deleteData(int data){
        Link prev = first;
        Link current = first;
        Link temp = null;
        if(isEmpty()){
            System.out.println("List is Empty");
        }
        if(findData(data)){
            System.out.println("The item can be deleted");
        }
        else System.out.println("The item is not found");
        // if the data item to be deleted is the first item
        if(first.getData() == data){
            temp = first;
            first = first.next;
        }
        else{//the item to be deleted is not the first item
            while(current!=null){
                if(current.getData() == data){
                    temp = current;
                    prev.next = current.next;
                }
                prev = current;
                current = current.next;
            }
        }

        return temp;
    }

    public void displayList(){
        System.out.println("The List is: First ==> Last");
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}

public class SimpleLinkedList{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("list is Empty?" + list.isEmpty());

        list.insertAtFirst(22);
        list.insertAtFirst(33);
        list.insertAtFirst(44);
        list.insertAtFirst(99);
        list.insertAtFirst(55);
        list.insertAtFirst(66);
        list.insertAtFirst(77);
        list.insertAtFirst(88);

        list.displayList();

        System.out.println("list is Empty?" + list.isEmpty());

        boolean present = list.findData(22);
        System.out.println("Item is present " + present);

        Link deleted = list.deleteData(44);
        System.out.println(deleted.getData());

        list.displayList();

        Link deletedFirst = list.deleteData(88);
        System.out.println(deletedFirst.getData());

        list.displayList();

        Link deletedLast = list.deleteData(22);
        System.out.println(deletedLast.getData());

        list.displayList();
    }

}
