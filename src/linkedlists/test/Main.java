package linkedlists.test;

import linkedlists.service.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        //Adding element in node
        list.addFirst(70);
        list.addFirst(30);
        list.addFirst(56);

        list.display();
    }
}