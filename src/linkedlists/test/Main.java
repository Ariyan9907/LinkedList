package linkedlists.test;

import linkedlists.service.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        //Adding element in node
        list.addFirst(70);
        list.addLast(80);

        //inserting after head
        list.insertAfter(list.head,33);

        list.display();
    }
}