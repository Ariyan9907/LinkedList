# UC5 - Delete the First Node from the Linked List

## Objective

The objective of this use case is to implement the `pop()` method, which removes the first node (head node) from the Linked List.

---

## Problem Statement

Given the Linked List:

```text
56 -> 30 -> 70
```

Delete the first node (`56`) so that the updated Linked List becomes:

```text
30 -> 70
```

The head of the Linked List should point to the next node after deletion.

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

### pop()

Removes the first node by updating the head reference to the next node.

```java
public Node<T> pop() {
    if (head == null) {
        return null;
    }

    Node<T> temp = head;
    head = head.next;
    return temp;
}
```

### display()

Traverses the Linked List and prints all elements.

---

## Working

Before deletion

```text
head
 |
56 -> 30 -> 70 -> null
```

Update head

```java
head = head.next;
```

After deletion

```text
head
 |
30 -> 70 -> null
```

The original first node becomes detached from the Linked List.

---

## Output

```text
30 70
```

---

## Concepts Covered

- Head Node
- Deletion at Beginning
- Reference Reassignment
- Null Checking
- Generic Methods

---

## Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| pop() | O(1) |
| display() | O(n) |

---

## Learning Outcome

After completing this use case, you will understand:

- How to remove the first node from a Linked List.
- Why deleting the head node is a constant-time operation.
- How updating the head reference automatically removes the first node from the list.
- How to safely handle deletion when the Linked List is empty.
