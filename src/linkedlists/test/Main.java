package linkedlists.test;

import linkedlists.model.Node;
import linkedlists.service.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.addLast(56);
        list.addLast(30);
        list.addLast(70);


//        list.display();
//        System.out.println(list.search(70));

        System.out.println("Before Insertion:");
        list.display();

        Node<Integer> node = list.search(30);

        if (node != null) {
            list.insertAfter(node, 40);
        }

        System.out.println("After Insertion:");
        list.display();
    }
}