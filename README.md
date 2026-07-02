# UC3 - Add Elements at the End of the Linked List

## Objective

The objective of this use case is to implement the `addLast()` method, which inserts a new node at the end of the Linked List.

---

## Problem Statement

Create a Linked List by adding elements to the end of the list so that the final sequence is:

```text
56 -> 30 -> 70
```

The new node should be appended as the last node in the Linked List.

---

## Project Structure

```text
src
└── linkedlists
    ├── model
    │      Node.java
    ├── service
    │      LinkedList.java
    └── test
           Main.java
```

---

## Methods Implemented

### addLast(T data)

Creates a new node and inserts it at the end of the Linked List.

```java
public void addLast(T data) {
    Node<T> newNode = new Node<>(data);

    if (head == null) {
        head = newNode;
        return;
    }

    Node<T> temp = head;

    while (temp.next != null) {
        temp = temp.next;
    }

    temp.next = newNode;
}
```

### display()

Traverses the Linked List and prints all elements.

```java
public void display() {
    Node<T> temp = head;

    while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
}
```

---

## Working

Initially

```text
head
 |
56 -> 30 -> null
```

After adding 70

```text
head
 |
56 -> 30 -> 70 -> null
```

The traversal starts from the head and moves to the last node before attaching the new node.

---

## Output

```text
56 30 70
```

---

## Concepts Covered

- Tail Insertion
- Linked List Traversal
- Null Reference Check
- Generic Methods
- Dynamic Node Linking

---

## Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| addLast() | O(n) |
| display() | O(n) |

---

## Learning Outcome

After completing this use case, you will understand:

- How to traverse a Linked List until the last node.
- How to append a node at the end of the list.
- Why inserting at the end requires traversal in a Singly Linked List.
- How to handle insertion when the list is initially empty.
