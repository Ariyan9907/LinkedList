package linkedlists.test;

import linkedlists.model.Node;

public class Main {

    public static void main(String[] args) {
        //inserting data
        Node<Integer> first = new Node<>(56);
        Node<Integer> second = new Node<>(30);
        Node<Integer> third = new Node<>(70);

        first.next = second;
        second.next = third;

        Node<Integer> temp = first;

        //printing linked list
        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }
    }
}