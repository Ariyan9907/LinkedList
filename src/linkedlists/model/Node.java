package linkedlists.model;

public class Node<T> {
    public T data;
    public Node<T> next;

    //Construtor for node
    public Node(T data){
        this.data=data;
        this.next=null;
    }

}
