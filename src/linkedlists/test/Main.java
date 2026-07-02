package linkedlists.test;

import linkedlists.model.Node;
import linkedlists.service.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.addLast(56);
        list.addLast(30);
        list.addLast(70);

        System.out.println("Before Pop Last:");
        list.display();

        Node<Integer> removed = list.popLast();

        System.out.println("Removed Node : " + removed.data);

        System.out.println("After Pop Last:");
        list.display();
    }
}