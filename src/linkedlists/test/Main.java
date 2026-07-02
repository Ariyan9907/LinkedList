package linkedlists.test;

import linkedlists.service.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.addLast(56);
        list.addLast(30);
        list.addLast(40);
        list.addLast(70);

        System.out.println("Before Delete:");
        list.display();

        list.delete(40);

        System.out.println("After Delete:");
        list.display();

        System.out.println("Size : " + list.size());
    }
}