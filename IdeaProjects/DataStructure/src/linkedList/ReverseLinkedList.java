package linkedList;

public class ReverseLinkedList {
    Node head;


    private int size;

    ReverseLinkedList(){
        this.size=0;
    }
    class Node{
        String data;

        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    // add-first,last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next= head;
        head = newNode;
    }
    // add - last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next !=null){
            currNode =currNode.next;
        }
        currNode.next= newNode;

    }
    //print
    public void printList(){
        if (head==null){
            System.out.println("LIST is Empty");
        }
        Node currNode=head;
        while(currNode !=null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NUll");
    }
    //delete first
    public void DeleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }
    //delete last
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next==null){
            head=null;
            return;
        }
        Node secondLast = head;
        Node lastNode =head.next;

        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;

        }
        secondLast.next=null;

    }
    public int getSize(){
        return size;
    }

    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.addLast("Aman");
        list.addLast("is");
        list.addLast("My");
        list.addLast("Friend");

        list.printList();
        list.reverseIterate();
        list.printList();


    }

}
