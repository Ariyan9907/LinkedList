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
