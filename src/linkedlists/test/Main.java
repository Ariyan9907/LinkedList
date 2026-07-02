package linkedlists.test;

import linkedlists.service.OrderedLinkedList;

public class Main {

    public static void main(String[] args) {

        OrderedLinkedList<Integer> list = new OrderedLinkedList<>();

        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);

        list.display();
    }
}