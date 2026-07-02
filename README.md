# UC2 - Add Elements at the Beginning of the Linked List

## Objective

The objective of this use case is to implement the `addFirst()` method, which inserts a new node at the beginning of the Linked List.

---

## Problem Statement

Create a Linked List by adding elements to the front of the list so that the final sequence is:

```text
56 -> 30 -> 70
```

Each new node should become the new head of the Linked List.

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

### addFirst(T data)

Creates a new node and inserts it at the beginning of the Linked List.

```java
public void addFirst(T data) {
    Node<T> newNode = new Node<>(data);
    newNode.next = head;
    head = newNode;
}
```

### display()

Traverses the Linked List from the head node and prints each element.

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
null
```

After adding 70

```text
head
 |
70 -> null
```

After adding 30

```text
head
 |
30 -> 70 -> null
```

After adding 56

```text
head
 |
56 -> 30 -> 70 -> null
```

---

## Output

```text
56 30 70
```

---

## Concepts Covered

- Head Node
- Linked List Traversal
- Insertion at Beginning
- Generic Methods
- Reference Manipulation

---

## Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| addFirst() | O(1) |
| display() | O(n) |

---

## Learning Outcome

After completing this use case, you will understand:

- How the head node changes after every insertion.
- Why insertion at the beginning of a Linked List is a constant-time operation.
- How to traverse a Linked List using a temporary reference.
- The importance of updating node references correctly.
