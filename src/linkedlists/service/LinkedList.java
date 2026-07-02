package linkedlists.service;
import linkedlists.model.Node;

public class LinkedList<T> {
    public Node<T> head;


    //adding first to node
    public void addFirst(T data){
        Node<T> newNode = new Node<T>(data);
        newNode.next=head;
        head=newNode;
    }

    public void addLast(T data){
        Node<T> newNode=new Node<T>(data);
        // If the list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node
        Node<T> temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        // Attach the new node
        temp.next = newNode;
    }

    //insert after
    public void insertAfter(Node<T> previousNode, T data) {

        if (previousNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }

        Node<T> newNode = new Node<>(data);

        newNode.next = previousNode.next;

        previousNode.next = newNode;
    }

    //Removing popped node
    public Node<T> pop() {

        if (head == null) {
            return null;
        }

        Node<T> poppedNode = head;

        head = head.next;

        return poppedNode;
    }


    //printing list
    public void display(){
        Node<T> temp=head;

        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("->");
            }
            temp=temp.next;
        }
        System.out.println();
    }

}
