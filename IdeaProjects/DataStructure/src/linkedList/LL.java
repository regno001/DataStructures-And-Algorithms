package linkedList;

public class LL {
    Node head;
    class Node{
        String data;

        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
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

        }
        //delete last
        public void deleteLast(){
            if(head==null){
                System.out.println("List is empty");
                return;
            }
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
    public static void main(String[] args) {
        LL list = new LL();
list.addFirst("A");
list.addFirst("is");
list.printList();
        System.out.println("add at last");
list.addLast("Sumit");

list.printList();
        System.out.println("deleted the first node");
list.DeleteFirst();

list.printList();
        System.out.println("delete the last");

list.deleteLast();
list.printList();
    }
}
