package linkedlists.test;

import linkedlists.model.Node;
import linkedlists.service.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        //Adding element in node
        list.addFirst(70);
        list.addLast(80);


        System.out.println("Before Pop:");
        list.display();

        Node<Integer> removed = list.pop();

        System.out.println("Removed Node : " + removed.data);

        System.out.println("After Pop:");

        list.display();
    }
}