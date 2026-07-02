package linkedlists.service;

import linkedlists.model.Node;

public class OrderedLinkedList<T extends Comparable<T>> {

    public Node<T> head;

    public void add(T data) {

        Node<T> newNode = new Node<>(data);

        // Empty list
        if (head == null) {
            head = newNode;
            return;
        }

        // Insert at beginning
        if (data.compareTo(head.data) < 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node<T> current = head;

        while (current.next != null &&
                current.next.data.compareTo(data) < 0) {

            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public void display() {

        Node<T> temp = head;

        while (temp != null) {

            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
}